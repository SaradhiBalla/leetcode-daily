package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 26 - Remove Duplicates from Sorted Array
// Approach: Two Pointer (Slow and Fast Pointer)
//
// Time Complexity: O(n)
//    - Single pass through array
//
// Space Complexity: O(1)
//    - In-place modification, no extra space used
// ---------------------------------------------------------

public class LC_26_Remove_Duplicates_from_Sorted_Array {

    static class Solution {
        public int removeDuplicates(int[] nums) {

            int index = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[index]) {
                    index++;
                    nums[index] = nums[i];
                }
            }

            return index + 1;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Solution obj = new Solution();
        int k = obj.removeDuplicates(nums);

        System.out.println("k (unique count): " + k);
        System.out.println("Unique elements: " +
                Arrays.toString(Arrays.copyOf(nums, k)));
    }
}