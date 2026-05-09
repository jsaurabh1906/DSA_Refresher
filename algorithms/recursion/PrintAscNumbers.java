public class PrintAscNumbers {
    public static void printNums(int n) {
        // Base Condition
        if (n > 5)
            return;
        // Print Numbers
        System.out.println(n);
        // Recursive Function Call
        printNums(n + 1);
    }

    public static void main(String[] args) {
        int num = 1;
        printNums(num);
    }
}

// Idea: This recursive example prints numbers from a starting value up to 5 by
// calling the same method
// with an incremented argument until a base condition stops the recursion.
//
// Step-by-step implementation:
// 1. Define a recursive method `printNums(int n)` that will print the current
// value and recurse.
// 2. Add a base condition to stop recursion when the value exceeds the target
// limit (n > 5).
// 3. Print the current number `n`.
// 4. Make a recursive call to `printNums(n + 1)` to continue with the next
// number.
// 5. Each recursive call handles one number and then delegates the next number
// to the next call.
// 6. Recursion unwinds automatically once the base condition is reached.
//
// Time Complexity:
// - O(k) where k is the number of numbers printed (in this case 5 - start + 1).
// - Each recursive call does a constant amount of work and the calls occur
// sequentially.
//
// Space Complexity:
// - O(k) due to the recursion call stack.
// - Each recursive call adds one stack frame until the base condition is
// reached.
//
// Notes about recursion:
// - Recursion is a technique where a function calls itself to solve smaller
// instances of the same problem.
// - A recursive algorithm requires two parts: a base case to stop recursion and
// a recursive case to reduce the problem.
// - In this example, the base case is `n > 5`, and the recursive case is
// `printNums(n + 1)`.
// - Recursion can make code easier to write and understand for problems with
// repetitive structure,
// but it uses extra stack space compared to iterative solutions.
// - Common recursion patterns include direct recursion, tail recursion, divide
// and conquer, and backtracking.