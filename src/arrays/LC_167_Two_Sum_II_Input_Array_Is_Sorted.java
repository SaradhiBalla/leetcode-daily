package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 167 - Two Sum II (Input Array Is Sorted)
// Approach: Two Pointer
//
// Time Complexity: O(n)
//    - Single pass using left and right pointers
//
// Space Complexity: O(1)
//    - No extra space used (excluding output array)
// ---------------------------------------------------------

public class LC_167_Two_Sum_II_Input_Array_Is_Sorted {

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {

            int left = 0;
            int right = numbers.length - 1;

            while (left < right) {

                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    return new int[]{left + 1, right + 1};
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        Solution obj = new Solution();
        int[] result = obj.twoSum(numbers, target);

        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        System.out.println("Output indices (1-based): " + Arrays.toString(result));
    }
}