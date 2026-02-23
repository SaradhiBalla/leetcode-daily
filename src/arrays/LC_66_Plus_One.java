package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 66 - Plus One
// Approach: Simulate Addition with Carry (Right to Left)
//
// Time Complexity: O(n)
//    - In worst case, traverse entire array
//
// Space Complexity: O(1)
//    - In-place modification (extra array only if overflow)
// ---------------------------------------------------------

public class LC_66_Plus_One {

    static class Solution {
        public int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] += 1;

                if (digits[i] < 10) {
                    return digits;
                }

                digits[i] = 0;
            }

            // If all digits were 9
            int[] result = new int[digits.length + 1];
            result[0] = 1;

            return result;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] digits = {9, 9, 9};

        Solution obj = new Solution();
        int[] result = obj.plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result));
    }
}