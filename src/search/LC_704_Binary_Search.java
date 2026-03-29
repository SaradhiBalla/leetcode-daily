package search;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 704 - Binary Search
// Approach: Iterative Binary Search
//
// Time Complexity: O(log n)
//    - Search space halves each iteration
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_704_Binary_Search {

    static class Solution {
        public int search(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                }
                else if (nums[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        Solution obj = new Solution();
        int result = obj.search(nums, target);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Index: " + result);
    }
}