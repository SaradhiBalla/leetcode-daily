package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 268 - Missing Number
// Approach: Mathematical Formula (Sum of First N Numbers)
//
// Time Complexity: O(n)
//    - Single pass to compute actual sum
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_268_Missing_Number {

    static class Solution {
        public int missingNumber(int[] nums) {

            int n = nums.length;

            int expectedSum = n * (n + 1) / 2;

            int actualSum = 0;
            for (int i = 0; i < nums.length; i++) {
                actualSum += nums[i];
            }

            return expectedSum - actualSum;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {3, 0, 1};

        Solution obj = new Solution();
        int result = obj.missingNumber(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Missing Number: " + result);
    }
}