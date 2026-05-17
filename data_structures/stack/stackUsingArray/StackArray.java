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
}

// Idea: This class implements a stack using a fixed-size array.
// A stack is a LIFO (Last-In, First-Out) data structure where the last element
// pushed
// is the first one popped.
//
// Key operations:
// - push: add a value to the top of the stack
// - isEmpty: check if the stack contains no elements
// - display: print stack contents from top to bottom
//
// How this implementation works:
// 1. The stack is represented by an integer array `arr` and an index `top`.
// 2. `top` starts at -1 when the stack is empty.
// 3. On push, `top` is incremented and the value is stored at `arr[top]`.
// 4. If `top` reaches `capacity - 1`, the stack is full and further pushes
// overflow.
// 5. `display` prints values from the current top down to index 0.
//
// Time Complexity:
// - push: O(1)
// - isEmpty: O(1)
// - display: O(n) where n is the number of elements in the stack
//
// Space Complexity:
// - O(n) where n is the stack capacity
// - The stack uses a fixed-size array and constant extra space for variables
//
// Note: This version does not include pop or peek methods, but those can be
// added
// easily using the `top` index to remove or inspect the current top element.
