public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 20, 2, 7, 12, 15, 1, 6, 8 };
        // Before Sort
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int low = 0; // Starting index of the array
        int high = arr.length - 1; // Ending index of the array
        quickSort(arr, low, high);

        // After Sort
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");

        }
    }

    // Recursive function to perform QuickSort
    private static void quickSort(int[] arr, int low, int high) {

        // Base case: if low >= high, the subarray has 0 or 1 elements, so it's sorted
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIdx = partition(arr, low, high);

            // Recursively sort the left subarray (elements < pivot)
            quickSort(arr, low, pivotIdx - 1); // left array
            // Recursively sort the right subarray (elements > pivot)
            quickSort(arr, pivotIdx + 1, high); // right array
        }

    }

    // Partition function using Lomuto partition scheme (pivot is the last element)
    private static int partition(int[] arr, int low, int high) {

        // i keeps track of the boundary between elements < pivot and elements >= pivot
        int i = low - 1;

        // j iterates through the array from low to high-1
        for (int j = low; j < high; j++) {
            // If current element is less than pivot (arr[high])
            if (arr[j] < arr[high]) {

                i++; // Move the boundary
                // Swap arr[i] and arr[j] to place smaller element in correct position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        // Place the pivot in its correct position by swapping with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the pivot index
        return i + 1;
    }
}

// Idea: QuickSort is a highly efficient divide-and-conquer sorting algorithm
// that works by selecting a
// 'pivot' element from the array and partitioning the other elements into two
// sub-arrays according to
// whether they are less than or greater than the pivot. The sub-arrays are then
// sorted recursively.
//
// Step-by-step implementation:
// 1. Choose a pivot element (in this implementation, we use the last element as
// pivot)
// 2. Partition the array: rearrange elements so that all elements less than
// pivot come before it,
// and all elements greater come after it. The pivot is now in its final sorted
// position.
// 3. Recursively apply the same process to the left sub-array (elements <
// pivot)
// 4. Recursively apply the same process to the right sub-array (elements >
// pivot)
// 5. Base case: when sub-array has 0 or 1 elements, it's already sorted
//
// Time Complexity:
// - Best Case: O(n log n) - When pivot consistently divides array into roughly
// equal halves
// - Worst Case: O(n^2) - When pivot is always the smallest or largest element
// (poor partitioning)
// - Average Case: O(n log n) - For most practical cases with good pivot
// selection
//
//
// Space Complexity:
// - O(1) auxiliary space - QuickSort is an in-place sorting algorithm that
// doesn't require additional arrays
// - O(log n) worst-case space due to the recursion call stack (maximum depth is
// log n for balanced partitions)
// - Note: The O(log n) space comes from the recursion stack, not from storing
// extra data structures
