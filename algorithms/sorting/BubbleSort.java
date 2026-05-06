public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 5, 9, 1, 3, 8, 2, 6 };

        // before sort
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        // after sort
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Idea: Repeatedly swap adjacent elements if they are in wrong order.
// Swap the largest element to the end of the array in each iteration.
// You repeatedly push the largest element to the end like bubbles rising.

// Implementation Thinking
// Outer loop → controls number of passes
// Inner loop → compare adjacent elements
// Swap if arr[j] > arr[j+1]
// After each pass → largest element is fixed at end

// Time Complexity :
// Average and Worst : O(n^2)
// Best: O(n)

// Space Complexity : O(1)