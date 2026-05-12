public class FibonacciSeries { // 0 1 1 2 3 5 8 13

    public static void main(String[] args) {
        int a = 0, b = 1;
        int nTerms = 8;

        System.out.print(a + " " + b + " ");
        printFib(a, b, nTerms - 2);
    }

    private static void printFib(int a, int b, int nTerms) {

        if (nTerms == 0)
            return;

        int sum = a + b;
        System.out.print(sum + " ");
        printFib(b, sum, nTerms - 1);
    }
}

// Idea: This recursive implementation generates and prints the Fibonacci series
// up to a specified number of terms.
// The Fibonacci sequence is defined as: F(0) = 0, F(1) = 1, F(n) = F(n-1) +
// F(n-2) for n > 1.
// This code uses a helper method to recursively compute and print each
// subsequent term.
//
// Step-by-step implementation:
// 1. Initialize first two terms: a = 0, b = 1
// 2. Print the first two terms directly in main
// 3. Call printFib with remaining terms to print (nTerms - 2)
// 4. In printFib: if no more terms to print, return (base case)
// 5. Calculate next term: sum = a + b
// 6. Print the sum
// 7. Recurse with updated values: printFib(b, sum, nTerms - 1)
//
// Dry run stack trace for nTerms = 8 (printing 6 more terms after initial 0 and
// 1):
// Initial call: printFib(0, 1, 6)
// -> sum = 0+1 = 1, print "1 ", call printFib(1, 1, 5)
// -> sum = 1+1 = 2, print "2 ", call printFib(1, 2, 4)
// -> sum = 1+2 = 3, print "3 ", call printFib(2, 3, 3)
// -> sum = 2+3 = 5, print "5 ", call printFib(3, 5, 2)
// -> sum = 3+5 = 8, print "8 ", call printFib(5, 8, 1)
// -> sum = 5+8 = 13, print "13 ", call printFib(8, 13, 0)
// -> nTerms == 0, return
// <- return
// <- return
// <- return
// <- return
// <- return
// <- return
// Output: 0 1 1 2 3 5 8 13
//
// Time Complexity:
// - O(n) where n is the number of terms to generate
// - Each recursive call performs constant-time operations (addition and
// printing)
//
// Space Complexity:
// - O(n) due to the maximum recursion depth
// - Each recursive call adds a stack frame until the base case is reached
