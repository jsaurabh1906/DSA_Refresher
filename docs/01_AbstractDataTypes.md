# 📘 Abstract Data Types (ADT) - Complete Guide

## 📌 What is an Abstract Data Type?

An **Abstract Data Type (ADT)** is a type (or model) for data where:
- The **behavior (operations)** is defined
- The **implementation details are hidden**

👉 It focuses on **what operations can be performed**, not **how they are implemented**

---

## 🧠 Simple Definition

> An **ADT** defines a data structure by its operations and behavior, without specifying implementation details.

---

## 🎯 Key Idea

- **What to do** → Defined in ADT
- **How to do** → Defined in Data Structure implementation

---

## 🧩 Real-Life Analogy

### 📱 Example: Mobile Phone
- You can:
    - Call 📞
    - Message 💬
    - Browse 🌐

But you don’t know:
- How signals are processed internally
- How hardware works

👉 You only use the functionality → That’s ADT

---

## ⚙️ Components of ADT

### 1. **Data**
The values stored

### 2. **Operations**
Functions that can be performed on the data

---

## 🔧 Example: Stack ADT

### Operations:
- `push(x)` → Insert element
- `pop()` → Remove top element
- `peek()` → View top element
- `isEmpty()` → Check if stack is empty

👉 This defines the **ADT**, not how it's built.

---

## 🏗 Implementation of Stack

Stack ADT can be implemented using:
- Array
- Linked List

👉 Different implementations, same ADT

---

## 🔗 ADT vs Data Structure

| Feature | ADT | Data Structure |
|--------|-----|----------------|
| Focus | What operations | How operations |
| Level | Logical | Physical |
| Example | Stack, Queue | Array, Linked List |

---

## 🧠 Examples of ADTs

### 🔹 List ADT
- Add element
- Remove element
- Traverse

---

### 🔹 Stack ADT
- LIFO (Last In First Out)
- Push / Pop

---

### 🔹 Queue ADT
- FIFO (First In First Out)
- Enqueue / Dequeue

---

### 🔹 Map (Dictionary) ADT
- Key-value pairs
- Insert / Delete / Search

---

## 🚀 Why Do We Need ADTs?

### 1. **Abstraction**
Hides complex implementation details

---

### 2. **Flexibility**
You can change implementation without affecting usage

---

### 3. **Reusability**
Same ADT can be used in different programs

---

### 4. **Better Design**
Encourages modular and clean code

---

## 📌 Example in Code (JavaScript)

```js
// Stack ADT implementation using Array
class Stack {
  constructor() {
    this.items = [];
  }

  push(element) {
    this.items.push(element);
  }

  pop() {
    if (this.isEmpty()) return "Stack is empty";
    return this.items.pop();
  }

  peek() {
    return this.items[this.items.length - 1];
  }

  isEmpty() {
    return this.items.length === 0;
  }
}

// Usage
const stack = new Stack();
stack.push(10);
stack.push(20);
console.log(stack.peek()); // 20

```
## 📌 Example in Code (Java)


```
import java.util.ArrayList;

// Stack ADT implementation using ArrayList
public class Stack<T> {
    private ArrayList<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    // Push element onto the stack
    public void push(T element) {
        items.add(element);
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    // Peek at the top element without removing
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return items.size() == 0;
    }

    // Main method to test the Stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // 20
    }
}
```