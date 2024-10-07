package DSA;

import java.util.Scanner;

public class CombinedSort {

    // Selection Sort method
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort method
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0...i-1], that are greater than key, to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Method to display array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to copy array
    public static int[] copyArray(int[] originalArray) {
        int[] copy = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copy, 0, originalArray.length);
        return copy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] array = {64, 25, 12, 22, 11};

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Create a copy of the original array for both sorts
        int[] selectionArray = copyArray(array);
        int[] insertionArray = copyArray(array);

        // Perform Selection Sort
        selectionSort(selectionArray);
        System.out.println("Array sorted using Selection Sort:");
        printArray(selectionArray);

        // Perform Insertion Sort
        insertionSort(insertionArray);
        System.out.println("Array sorted using Insertion Sort:");
        printArray(insertionArray);
    }
}
