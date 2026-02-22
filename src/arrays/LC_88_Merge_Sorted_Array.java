package arrays;
import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 88 - Merge Sorted Array
// Approach: Three Pointer (Fill from Back)
//
// Time Complexity: O(m + n)
//    - Each element from nums1 and nums2 processed once
//
// Space Complexity: O(1)
//    - In-place merge, no extra array used
// ---------------------------------------------------------
public class LC_88_Merge_Sorted_Array {

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m - 1;          // last element of valid nums1
            int j = n - 1;          // last element of nums2
            int k = m + n - 1;      // last position of nums1

            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }

            // If nums2 still has elements
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution obj = new Solution();
        obj.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}