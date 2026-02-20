package arrays;
// ---------------------------------------------------------
// Problem: LC 217 - Contains Duplicate
// Approach: Sorting
//
// Time Complexity: O(n log n)
//    - Due to Arrays.sort()
//
// Space Complexity: O(1)
//    - In-place sorting (ignoring recursion stack)
// ---------------------------------------------------------
import java.util.Arrays;

public class LC_219_Contains_Duplicates {

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        //Driver code reference from ChatGPT
        // 🔹 Static Test Case
        int[] nums = {1, 2, 3, 1};

        Solution obj = new Solution();
        boolean result = obj.containsDuplicate(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Contains Duplicate: " + result);
    }
}