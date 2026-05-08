public class InsertionSort {
    private static void insertionSort(int[] arr) {

        // Start from the second element (index 1) and iterate through the array
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            // Shift elements
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the current element (temp) into its correct position
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 9, 1, 3, 8, 2, 6 };

        // before sort
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        // after sort
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Idea: Insertion sort is a simple comparison-based sorting algorithm that
// builds the final sorted array
// one element at a time. It works by taking each element from the unsorted
// portion and inserting it into
// its correct position in the already sorted portion of the array, similar to
// how you sort playing cards.
//
// Step-by-step implementation:
// 1. Start with the second element (index 1) as the first element is considered
// sorted
// 2. Store the current element (arr[i]) in a temporary variable
// 3. Compare the current element with elements in the sorted portion (moving
// backwards from i-1)
// 4. Shift elements to the right if they are greater than the current element
// 5. Insert the current element into its correct position in the sorted portion
// 6. Repeat for each subsequent element until the entire array is sorted
//
// Time Complexity:
// - Best Case: O(n) - When the array is already sorted, only one comparison per
// element is needed
// - Worst Case: O(n^2) - When the array is reverse sorted, each element needs
// to be compared with all previous elements
// - Average Case: O(n^2) - For random input, approximately half the elements in
// the sorted portion need to be shifted
//
// Space Complexity:
// - O(1) - Insertion sort is an in-place sorting algorithm that uses only a
// constant amount of extra space
// - Only a few variables (temp, j) are used for the sorting process, regardless
// of input size
