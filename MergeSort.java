package DSA;

import java.util.Arrays;

public class MergeSort {
    // Recursive merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(arr, left, mid);
            // Recursively sort the right half
            mergeSort(arr, mid + 1, right);
            // Merge the two halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted halves of an array
    private static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two sub-arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
        for (int i = 0; i < n2; i++) rightArray[i] = arr[mid + 1 + i];

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArray if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements from rightArray if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array (Merge Sort): " + Arrays.toString(arr));
    }
}
