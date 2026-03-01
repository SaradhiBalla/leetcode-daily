package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 977 - Squares of a Sorted Array
// Approach: Square and Sort
//
// Time Complexity: O(n log n)
//    - Squaring takes O(n)
//    - Sorting takes O(n log n)
//
// Space Complexity: O(1)
//    - In-place modification (ignoring sort internals)
// ---------------------------------------------------------

public class LC_977_Squares_of_a_Sorted_Array {

    static class Solution {
        public int[] sortedSquares(int[] nums) {

            // Square each element
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            // Sort the squared array
            Arrays.sort(nums);

            return nums;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {-4, -1, 0, 3, 10};

        Solution obj = new Solution();
        int[] result = obj.sortedSquares(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}