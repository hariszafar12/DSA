package DSA;

import java.util.Arrays;

public class IterativeMergeSort {

    public void mergeSort(int[] array) {
        int n = array.length;
        int[] tempArray = new int[n];

        // Start with subarrays of size 1, then 2, 4, 8, etc.
        for (int size = 1; size < n; size *= 2) {
            // Traverse the array in subarray chunks of the given size
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {
                // Define the bounds of the two subarrays to be merged
                int mid = Math.min(leftStart + size - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * size - 1, n - 1);
                
                // Merge the two subarrays
                merge(array, tempArray, leftStart, mid, rightEnd);
            }
        }
    }

    // Merge function to merge two sorted subarrays
    private void merge(int[] array, int[] tempArray, int leftStart, int mid, int rightEnd) {
        int i = leftStart;
        int j = mid + 1;
        int k = leftStart;

        // Merge elements from both subarrays into tempArray
        while (i <= mid && j <= rightEnd) {
            if (array[i] <= array[j]) {
                tempArray[k++] = array[i++];
            } else {
                tempArray[k++] = array[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i <= mid) {
            tempArray[k++] = array[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j <= rightEnd) {
            tempArray[k++] = array[j++];
        }

        // Copy the sorted subarray back into the original array
        for (i = leftStart; i <= rightEnd; i++) {
            array[i] = tempArray[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11, 90, 45, 33};
        System.out.println("Original array: " + Arrays.toString(array));

        IterativeMergeSort sorter = new IterativeMergeSort();
        sorter.mergeSort(array);

        System.out.println("Sorted array using Iterative Merge Sort: " + Arrays.toString(array));
    }
}
