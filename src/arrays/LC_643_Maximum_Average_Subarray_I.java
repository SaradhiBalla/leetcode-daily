package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 643 - Maximum Average Subarray I
// Approach: Sliding Window
//
// Time Complexity: O(n)
//    - Traverse the array once
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_643_Maximum_Average_Subarray_I {

    static class Solution {
        public double findMaxAverage(int[] nums, int k) {

            int sum = 0;

            // First window
            for (int i = 0; i < k; i++) {
                sum = sum + nums[i];
            }

            int maxSum = sum;

            // Sliding window
            for (int i = k; i < nums.length; i++) {
                sum = sum + nums[i] - nums[i - k];
                maxSum = Math.max(maxSum, sum);
            }

            return (double) maxSum / k;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        Solution obj = new Solution();
        double result = obj.findMaxAverage(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("Maximum Average: " + result);
    }
}