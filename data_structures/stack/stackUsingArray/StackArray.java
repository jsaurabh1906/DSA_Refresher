package data_structures.stack.stackUsingArray;

public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // push
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow while pushing: " + value);
            return;
        }

        top++;
        arr[top] = value;

        System.out.println(value + ":- pushed in stack");
    }

    // Display Stack
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

    // pop method - removes and returns the top element from the stack
    public int pop() {
        // Check if stack is empty before popping
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Return -1 to indicate stack is empty
        }

        int value = arr[top]; // Get the value at the top
        top--; // Move top pointer down
        System.out.println(value + ":- popped from stack");
        return value; // Return the popped value
    }

    // Peek operation - returns the top element without removing it
    public int peek() {
        // Check if stack is empty before peeking
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return -1 to indicate stack is empty
        }

        return arr[top]; // Return the value at top without modifying top
    }

    // Size operation - returns the total number of elements currently in the stack
    public int size() {
        return top + 1; // Since top is 0-indexed, size is top + 1
    }

}

// Idea: This class implements a stack using a fixed-size array.
// A stack is a LIFO (Last-In, First-Out) data structure where the last element
// pushed
// is the first one popped.
//
// Key operations:
// - push: add a value to the top of the stack
// - pop: remove and return the top element
// - peek: view the top element without removing it
// - isEmpty: check if the stack contains no elements
// - size: get the current number of elements in the stack
// - display: print stack contents from top to bottom
//
// How this implementation works:
// 1. The stack is represented by an integer array `arr` and an index `top`.
// 2. `top` starts at -1 when the stack is empty.
// 3. On push, `top` is incremented and the value is stored at `arr[top]`.
// 4. If `top` reaches `capacity - 1`, the stack is full and further pushes
// overflow.
// 5. On pop, the value at `arr[top]` is returned and `top` is decremented.
// 6. `display` prints values from the current top down to index 0.
//
// Time Complexity:
// - push: O(1)
// - pop: O(1)
// - peek: O(1)
// - isEmpty: O(1)
// - size: O(1)
// - display: O(n) where n is the number of elements in the stack
//
// Space Complexity:
// - O(n) where n is the stack capacity
// - The stack uses a fixed-size array and constant extra space for variables
//
// Note: This version handles stack underflow by returning -1 when attempting to
// pop
// or peek from an empty stack. Overflow is handled by preventing pushes when
// full.
