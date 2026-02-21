package arrays;
import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 1480 - Running Sum of 1D Array
// Approach: In-place Prefix Sum
//
// Time Complexity: O(n)
//    - Single pass through array
//
// Space Complexity: O(1)
//    - In-place modification, no extra array used
// ---------------------------------------------------------

public class LC_1480_Running_Sum_of_1D_Array {
    static class Solution {
        public int[] runningSum(int[] nums) {

            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i] + nums[i - 1];
            }

            return nums;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {1, 2, 3, 4};

        Solution obj = new Solution();
        int[] result = obj.runningSum(nums);

        System.out.println("Running Sum: " + Arrays.toString(result));
    }
}
