public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest found element with the first unsorted element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 9, 1, 3, 8, 2, 6 };

        // before sort
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        // after sort
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Idea: Selection sort is a simple comparison-based sorting algorithm that
// works by repeatedly finding
// the minimum element from the unsorted portion of the array and swapping it
// with the first unsorted element.
// This process continues until the entire array is sorted.
//
// Step-by-step implementation:
// 1. Start with the first element as the minimum (minIndex = i)
// 2. Iterate through the remaining unsorted elements (from i+1 to end)
// 3. If a smaller element is found, update minIndex
// 4. After finding the minimum in the unsorted portion, swap it with the first
// unsorted element (arr[i])
// 5. Move to the next position (i++) and repeat until the array is sorted
//
// Time Complexity:
// - Best Case: O(n^2) - Even if array is already sorted, we still scan all
// elements
// - Worst Case: O(n^2) - Nested loops: outer loop runs n-1 times, inner loop
// runs n-i-1 times
// - Average Case: O(n^2) - Consistent quadratic time regardless of input
// distribution
//
// Space Complexity:
// - O(1) - Selection sort is an in-place sorting algorithm that uses only a
// constant amount of extra space
// - Only a few variables (minIndex, temp) are used for swapping, regardless of
// input size