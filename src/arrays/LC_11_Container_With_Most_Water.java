package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 11 - Container With Most Water
// Approach: Two Pointer
//
// Time Complexity: O(n)
//    - Single pass from both ends
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_11_Container_With_Most_Water {

    static class Solution {
        public int maxArea(int[] height) {

            int left = 0;
            int right = height.length - 1;
            int max = 0;

            while (left < right) {

                int h = Math.min(height[left], height[right]);
                int width = right - left;
                int area = h * width;

                max = Math.max(max, area);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] height = {1,8,6,2,5,4,8,3,7};

        Solution obj = new Solution();
        int result = obj.maxArea(height);

        System.out.println("Heights: " + Arrays.toString(height));
        System.out.println("Maximum Area: " + result);
    }
}