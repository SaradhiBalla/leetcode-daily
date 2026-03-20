package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// ---------------------------------------------------------
// Problem: LC 349 - Intersection of Two Arrays
// Approach: HashSet
//
// Time Complexity: O(n + m)
//    - Build set from nums1
//    - Traverse nums2
//
// Space Complexity: O(n)
//    - HashSet used to store elements
// ---------------------------------------------------------

public class LC_349_Intersection_of_Two_Arrays {

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> result = new HashSet<>();

            // Store nums1 elements
            for (int i = 0; i < nums1.length; i++) {
                set1.add(nums1[i]);
            }

            // Check intersection
            for (int i = 0; i < nums2.length; i++) {
                if (set1.contains(nums2[i])) {
                    result.add(nums2[i]);
                }
            }

            // Convert set to array
            int[] output = new int[result.size()];
            Integer[] temp = result.toArray(new Integer[0]);

            for (int i = 0; i < temp.length; i++) {
                output[i] = temp[i];
            }

            return output;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Solution obj = new Solution();
        int[] result = obj.intersection(nums1, nums2);

        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}