package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 283 - Move Zeroes
// Approach: Two Pointer (Stable Compaction)
//
// Time Complexity: O(n)
//    - Single pass to shift non-zero elements
//    - Second pass to fill remaining with zero
//
// Space Complexity: O(1)
//    - In-place modification, no extra array used
// ---------------------------------------------------------

public class LC_283_Move_Zeroes {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[j]=nums[i];
                    j++;
                }
            }
            while(j<nums.length){
                nums[j]=0;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {0, 1, 0, 3, 12};

        Solution obj = new Solution();
        obj.moveZeroes(nums);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}