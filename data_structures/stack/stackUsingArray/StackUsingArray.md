# Stack Data Structure — Complete Guide with Java Array Implementation

---

## Table of Contents

1. [What is a Stack?](#what-is-a-stack)
2. [Real-World Analogies](#real-world-analogies)
3. [Core Properties](#core-properties)
4. [Stack Operations](#stack-operations)
5. [Implementation: Stack Using Array in Java](#implementation-stack-using-array-in-java)
6. [Method-by-Method Breakdown](#method-by-method-breakdown)
7. [Dry Run / Trace Example](#dry-run--trace-example)
8. [Time & Space Complexity](#time--space-complexity)
9. [Advantages & Limitations of Array-Based Stack](#advantages--limitations-of-array-based-stack)
10. [Common Use Cases](#common-use-cases)

---

## What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO** principle:

> **LIFO — Last In, First Out**
> The element inserted _last_ is the first one to be removed.

Think of it as a one-ended container — you can only interact with the **top** of the stack at any time.

```
        ┌───────┐
 TOP →  │   5   │  ← Last pushed, first popped
        ├───────┤
        │   3   │
        ├───────┤
        │   1   │  ← First pushed, last popped
        └───────┘
```

---

## Real-World Analogies

| Analogy                  | Why it's a Stack                                        |
| ------------------------ | ------------------------------------------------------- |
| 🍽️ Stack of plates       | You pick the top plate; the bottom one is last accessed |
| 📚 Stack of books        | You add/remove from the top                             |
| ↩️ Browser back button   | Last visited page is the first you go back to           |
| ✏️ Undo in a text editor | Last action is undone first                             |
| 📞 Function call stack   | Last called function returns first                      |

---

## Core Properties

- **One active end** — all insertions and deletions happen at the **top**
- **No random access** — you cannot reach an element in the middle directly
- **Ordered by insertion time** — the most recently added element is always accessible first
- **Bounded (array) or unbounded (linked list)** — depends on implementation

---

## Stack Operations

| Operation     | Description                                         | Also Known As    |
| ------------- | --------------------------------------------------- | ---------------- |
| `push(value)` | Insert an element at the top                        | Add / Enqueue    |
| `pop()`       | Remove and return the top element                   | Remove / Dequeue |
| `peek()`      | View the top element without removing it            | `top()`          |
| `isEmpty()`   | Check if the stack has no elements                  | —                |
| `size()`      | Return the count of elements currently in the stack | —                |
| `display()`   | Print all elements from top to bottom               | —                |

### Edge Cases to Always Handle

| Situation           | Triggered When                        | Response                                  |
| ------------------- | ------------------------------------- | ----------------------------------------- |
| **Stack Overflow**  | `push()` on a full stack              | Reject the push, print error              |
| **Stack Underflow** | `pop()` or `peek()` on an empty stack | Return sentinel value (`-1`), print error |

---

## Implementation: Stack Using Array in Java

```java
public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;             // -1 means the stack is empty
    }

    // isEmpty — O(1)
    public boolean isEmpty() {
        return top == -1;
    }

    // push — O(1)
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow while pushing: " + value);
            return;
        }
        top++;
        arr[top] = value;
        System.out.println(value + ":- pushed in stack");
    }

    // pop — O(1)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        System.out.println(value + ":- popped from stack");
        return value;
    }

    // peek — O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // size — O(1)
    public int size() {
        return top + 1;
    }

    // display — O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
```

---

## Method-by-Method Breakdown

### 1. Constructor — `StackArray(int size)`

```java
public StackArray(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
}
```

**What it does:**

- Allocates a fixed-size integer array in memory
- Stores the maximum allowed capacity
- Sets `top = -1` as a sentinel value meaning "no elements yet"

**Memory layout after `new StackArray(5)`:**

```
Index:    0    1    2    3    4
Array:  [ _  | _  | _  | _  | _ ]
top = -1                capacity = 5
```

---

### 2. `isEmpty()`

```java
public boolean isEmpty() {
    return top == -1;
}
```

**Logic:** Since `top` starts at `-1` and decrements back to `-1` when all elements are popped, checking `top == -1` reliably tells us the stack has no elements.

---

### 3. `push(int value)`

```java
public void push(int value) {
    if (top == capacity - 1) {          // ① Guard: full check
        System.out.println("Stack Overflow while pushing: " + value);
        return;
    }
    top++;                               // ② Move pointer up
    arr[top] = value;                    // ③ Store value
    System.out.println(value + ":- pushed in stack");
}
```

**Step-by-step for `push(10)`:**

```
Before:  top = -1
Step ①:  Is top (−1) == capacity−1 (4)? No → proceed
Step ②:  top becomes 0
Step ③:  arr[0] = 10

After:
Index:  [ 10 | _  | _  | _  | _ ]
                                    top = 0
```

**Why `top == capacity - 1`?**
Array indices run from `0` to `capacity - 1`. When `top` reaches `capacity - 1`, all slots are occupied — pushing further would go out of bounds.

---

### 4. `pop()`

```java
public int pop() {
    if (isEmpty()) {                     // ① Guard: empty check
        System.out.println("Stack Underflow");
        return -1;
    }
    int value = arr[top];                // ② Capture top value
    top--;                               // ③ Move pointer down
    System.out.println(value + ":- popped from stack");
    return value;                        // ④ Return captured value
}
```

**Important:** The actual data at `arr[top+1]` is NOT erased from memory — it's simply made **unreachable** by moving the `top` pointer down. The next `push()` will overwrite it.

**Before and after `pop()` with stack `[10, 20, 30]` (top = 2):**

```
Before:
Index:  [ 10 | 20 | 30 | _  | _ ]
                    ↑ top = 2

After:
Index:  [ 10 | 20 | 30 | _  | _ ]   ← 30 is still in memory, but unreachable
              ↑ top = 1
```

---

### 5. `peek()`

```java
public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
    return arr[top];                     // Read without modifying top
}
```

**Difference from `pop()`:** `peek()` reads `arr[top]` but does **not** decrement `top`. The stack remains unchanged.

---

### 6. `size()`

```java
public int size() {
    return top + 1;
}
```

**Why `top + 1`?**

| `top` value | Meaning        | Size |
| ----------- | -------------- | ---- |
| `-1`        | Stack is empty | `0`  |
| `0`         | One element    | `1`  |
| `3`         | Four elements  | `4`  |

Since `top` is zero-indexed, the count of elements is always one more than `top`.

---

### 7. `display()`

```java
public void display() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
    System.out.println("Stack Elements:");
    for (int i = top; i >= 0; i--) {   // Iterate from top → bottom
        System.out.println(arr[i]);
    }
}
```

The loop starts at `top` and walks down to `0`, printing in top-to-bottom order — which matches the visual mental model of a stack.

---

## Dry Run / Trace Example

```java
StackArray stack = new StackArray(4);

stack.push(10);
stack.push(20);
stack.push(30);
stack.display();
System.out.println("Peek: " + stack.peek());
System.out.println("Size: " + stack.size());
stack.pop();
stack.display();
stack.push(40);
stack.push(50);
stack.push(60);   // Overflow — capacity is 4, currently 3 elements
```

**Trace:**

```
Operation         arr state              top   Output
─────────────────────────────────────────────────────────────────
push(10)        [10, _ , _ , _ ]         0    "10:- pushed in stack"
push(20)        [10, 20, _ , _ ]         1    "20:- pushed in stack"
push(30)        [10, 20, 30, _ ]         2    "30:- pushed in stack"
display()       [10, 20, 30, _ ]         2    "30, 20, 10"
peek()          [10, 20, 30, _ ]         2    returns 30 (no change)
size()          [10, 20, 30, _ ]         2    returns 3
pop()           [10, 20, 30, _ ]         1    "30:- popped from stack"
display()       [10, 20, _ , _ ]         1    "20, 10"
push(40)        [10, 20, 40, _ ]         2    "40:- pushed in stack"
push(50)        [10, 20, 40, 50]         3    "50:- pushed in stack"
push(60)        [10, 20, 40, 50]         3    "Stack Overflow while pushing: 60"
```

---

## Time & Space Complexity

| Operation   | Time Complexity | Reason                              |
| ----------- | --------------- | ----------------------------------- |
| `push()`    | **O(1)**        | Direct index assignment using `top` |
| `pop()`     | **O(1)**        | Direct read + pointer decrement     |
| `peek()`    | **O(1)**        | Direct read at `arr[top]`           |
| `isEmpty()` | **O(1)**        | Single comparison                   |
| `size()`    | **O(1)**        | Arithmetic on `top`                 |
| `display()` | **O(n)**        | Iterates over all elements          |

**Space Complexity:** O(n) — where `n` is the `capacity` passed to the constructor. Memory is allocated upfront regardless of how many elements are actually stored.

---

## Advantages & Limitations of Array-Based Stack

### ✅ Advantages

- **Constant time operations** — push, pop, peek are all O(1)
- **Cache-friendly** — contiguous memory layout improves CPU cache performance
- **Simple implementation** — no pointers or node objects required
- **Memory-efficient per element** — no overhead per node (unlike linked list stacks)

### ❌ Limitations

- **Fixed capacity** — cannot grow beyond the size set at construction
- **Memory waste** — the full array is allocated even if the stack is mostly empty
- **No dynamic resizing** — to support this, you'd need to copy the array (like `ArrayList`)
- **Sentinel return value** — returning `-1` for underflow/overflow is fragile; a better approach uses exceptions

### 💡 Improvement: Exception-Based Error Handling

Instead of returning `-1` on errors, throw exceptions:

```java
public int pop() {
    if (isEmpty()) {
        throw new RuntimeException("Stack Underflow: cannot pop from an empty stack");
    }
    int value = arr[top];
    top--;
    return value;
}
```

This makes errors explicit and forces callers to handle them properly.

---

## Common Use Cases

| Use Case                      | How Stack Helps                                            |
| ----------------------------- | ---------------------------------------------------------- |
| **Expression evaluation**     | Convert and evaluate infix/postfix/prefix expressions      |
| **Balanced parentheses**      | Push open brackets, pop and match on close brackets        |
| **Undo/Redo functionality**   | Each action is pushed; undo pops the last action           |
| **Browser history**           | Pages visited are pushed; back button pops them            |
| **Function call stack (JVM)** | Each method call is a stack frame pushed on the call stack |
| **DFS (Depth-First Search)**  | Use an explicit stack to simulate recursion                |
| **Backtracking algorithms**   | Maze solving, N-Queens, Sudoku                             |
| **Syntax parsing**            | Compilers use stacks to parse grammar rules                |

---

## Summary

```
Stack = LIFO Data Structure
      = Fixed array + top pointer

Key invariants:
  • top == -1         → stack is empty
  • top == capacity-1 → stack is full
  • size == top + 1   → current element count

All core operations (push, pop, peek, size, isEmpty) run in O(1) time.
```
