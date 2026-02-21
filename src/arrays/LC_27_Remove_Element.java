package arrays;
import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 27 - Remove Element
// Approach: Two Pointer (Overwrite / In-place Filtering)
//
// Time Complexity: O(n)
//    - Single pass through array
//
// Space Complexity: O(1)
//    - In-place modification, no extra space used
// ---------------------------------------------------------
public class LC_27_Remove_Element {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
    }

    public static void main(String[] args) {
        // 🔹 Static Test Case
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Solution obj = new Solution();
        int k = obj.removeElement(nums, val);
        System.out.println("k (new length): " + k);
        System.out.println("Modified array (first k elements valid): "
                + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
