package DSA;

import java.util.Arrays;

public class SortingFour {

    // Function to sort four elements using at most 5 comparisons
    public static void SortingFour(int[] array) {
        if (array.length != 4) {
            System.out.println("Array must contain exactly 4 elements.");
            return;
        }

        // Step 1: Compare the first two elements
        if (array[0] > array[1]) {
            swap(array, 0, 1);  // Now array[0] <= array[1]
        }

        // Step 2: Compare the next two elements
        if (array[2] > array[3]) {
            swap(array, 2, 3);  // Now array[2] <= array[3]
        }

        // Step 3: Find the smallest element between array[0] and array[2]
        if (array[0] > array[2]) {
            swap(array, 0, 2);  // Now array[0] is the smallest
        }

        // Step 4: Find the largest element between array[1] and array[3]
        if (array[1] > array[3]) {
            swap(array, 1, 3);  // Now array[3] is the largest
        }

        // Step 5: Compare the middle two elements to place them in order
        if (array[1] > array[2]) {
            swap(array, 1, 2);  // Now array[1] <= array[2]
        }
    }

    // Utility function to swap elements in an array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 1, 2};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        SortingFour(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
