package data_structures.arrays;

public class ArrayBasics {
    // Example of declaring and initializing an array directly
    int[] marks = { 90, 85, 76, 88, 95 };

    public static void main(String[] args) {
        // 1. Declare an array reference
        int[] scores;

        // 2. Create the array with a fixed size of 5
        scores = new int[5];

        // 3. Initialize array elements individually
        scores[0] = 90;
        scores[1] = 85;
        scores[2] = 76;
        scores[3] = 88;
        scores[4] = 95;

        // 4. Access and print individual elements
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[4]);

        // 5. Update an element
        scores[2] = 80; // change the third score from 76 to 80
        System.out.println("Updated third score: " + scores[2]);

        // 6. Traverse the array using a normal for loop
        System.out.println("Scores using normal for loop:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        // 7. Traverse the array using an enhanced for loop
        System.out.println("Scores using enhanced for loop:");
        for (int value : scores) {
            System.out.println(value);
        }

        // 8. Print the length of the array
        System.out.println("Array length: " + scores.length);

        // 9. Example of direct array initialization in one line
        int[] marks = { 90, 85, 76, 88, 95 };
        System.out.println("Directly initialized marks array:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // 10. Example of multi-dimensional array declaration and initialization
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("2D Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // 11. Example of array of objects (String array)
        String[] names = { "Alice", "Bob", "Charlie" };
        System.out.println("Names array:");
        for (String name : names) {
            System.out.println(name);
        }

        // 12. Jagged array example (array of arrays with different lengths)
        int[][] jaggedArray = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
        System.out.println("Jagged Array:");
        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Other ways to declare and initialize arrays (jagged array example)
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];
    }
}
