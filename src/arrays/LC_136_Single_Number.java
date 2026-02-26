package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 136 - Single Number
// Approach: Bit Manipulation (XOR)
//
// Time Complexity: O(n)
//    - Single pass through array
//
// Space Complexity: O(1)
//    - No extra space used
//
// Key Property:
//    a ^ a = 0
//    a ^ 0 = a
// ---------------------------------------------------------

public class LC_136_Single_Number {

    static class Solution {
        public int singleNumber(int[] nums) {

            int result = 0;

            for (int i = 0; i < nums.length; i++) {
                result = result ^ nums[i];
            }

            return result;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {4, 1, 2, 1, 2};

        Solution obj = new Solution();
        int result = obj.singleNumber(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Single Number: " + result);
    }
}