public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 20, 2, 7, 12, 15, 1, 6, 8 };
        // Before Sort: print unsorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int start = 0; // Starting index of the array
        int end = arr.length - 1; // Ending index of the array
        divide(arr, start, end); // Begin merge sort recursion

        // After Sort: print sorted array
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void divide(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;

        // Base case: a subarray of length 0 or 1 is already sorted
        if (start >= end) {
            return;
        }

        // Divide the array into two halves
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        // Merge the sorted halves
        conquer(arr, start, mid, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        // Create a temporary array to hold merged values for this range
        int[] merged = new int[end - start + 1];

        int idx1 = start; // pointer for the first half
        int idx2 = mid + 1; // pointer for the second half
        int x = 0; // pointer for merged array

        // Merge two sorted halves into the temporary array
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        // Copy any remaining elements from the first half
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        // Copy any remaining elements from the second half
        while (idx2 <= end) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        // Copy merged values back into the original array
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}

// Idea: MergeSort is a divide-and-conquer sorting algorithm that splits the
// array into smaller parts,
// sorts each part recursively, and then merges the sorted parts back together.
//
// Step-by-step implementation:
// 1. If the array segment contains 0 or 1 element, it is already sorted.
// 2. Otherwise, split the segment into two halves using the middle index.
// 3. Recursively sort the left half.
// 4. Recursively sort the right half.
// 5. Merge the two sorted halves into a temporary array and copy the result
// back.
//
// Time Complexity:
// - Best Case: O(n log n) - MergeSort consistently divides the array in half
// and merges in linear time.
// - Worst Case: O(n log n) - Even for sorted or reverse-sorted input,
// performance remains the same.
// - Average Case: O(n log n) - Stable and predictable time complexity for all
// inputs.
//
// Space Complexity:
// - O(n) auxiliary space - MergeSort uses a temporary array for merging at each
// level of recursion.
// - O(log n) recursion depth - additional stack space is required for recursive
// calls.