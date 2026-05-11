public class Factorial {

    public static void main(String[] args) {
        int num = 6;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " : " + result);
    }

    private static int factorial(int num) {

        if (num == 1 || num == 0)
            return 1;

        int fact = factorial(num - 1);
        int ans = fact * num;
        return ans; // num * factorial(num-1)
    }
}

// Dry Run for factorial of 5
// factorial(5)
// = 5 * factorial(4)

// = 5 * 4 * factorial(3)

// = 5 * 4 * 3 * factorial(2)

// = 5 * 4 * 3 * 2 * factorial(1)

// = 5 * 4 * 3 * 2 * 1

// = 120