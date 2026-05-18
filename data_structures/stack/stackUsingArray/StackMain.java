package data_structures.stack.stackUsingArray;

public class StackMain {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.display();

        stack.pop();

        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // This will cause stack underflow

        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Stack Size: " + stack.size());
    }
}
