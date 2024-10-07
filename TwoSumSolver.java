package DSA;

import java.util.Arrays;

public class TwoSumSolver {

    public boolean TwoSum(int[] array, int K) {
        // Step 1: Sort the array
        Arrays.sort(array); // O(N log N)

        // Step 2: Use two-pointer technique
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int sum = array[left] + array[right];

            // If we find the sum equals K, return true
            if (sum == K) {
                return true;
            } 
            // If sum is less than K, move left pointer to the right to increase the sum
            else if (sum < K) {
                left++;
            } 
            // If sum is greater than K, move right pointer to the left to decrease the sum
            else {
                right--;
            }
        }

        // If no pair found, return false
        return false;
    }

    public static void main(String[] args) {
        TwoSumSolver solver = new TwoSumSolver();
        
        int[] array = {8, 4, 1, 6};
        int K = 10;

        boolean result = solver.TwoSum(array, K);
        if (result) {
            System.out.println("Yes, there are two numbers that sum to " + K);
        } else {
            System.out.println("No, there are no two numbers that sum to " + K);
        }
    }
}
