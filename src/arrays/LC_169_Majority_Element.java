package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 169 - Majority Element
// Approach: Sorting
//
// Time Complexity: O(n log n)
//    - Sorting the array
//
// Space Complexity: O(1)
//    - In-place sorting (ignoring internal recursion stack)
// ---------------------------------------------------------

public class LC_169_Majority_Element {

    static class Solution {
        public int majorityElement(int[] nums) {

            Arrays.sort(nums);

            return nums[nums.length / 2];
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Solution obj = new Solution();
        int result = obj.majorityElement(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Majority Element: " + result);
    }
}