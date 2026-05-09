public class PrintNumbers {
    public static void main(String[] args) {
        int num = 5;
        printNums(num);
    }

    private static void printNums(int num) {
        if (num <= 0)
            return;
        System.out.println(num);
        printNums(num - 1);

    }
}
