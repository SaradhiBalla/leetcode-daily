package arrays;

import java.util.Arrays;
import java.util.HashMap;

// ---------------------------------------------------------
// Problem: LC 219 - Contains Duplicate II
// Approach: HashMap (Value → Last Index)
//
// Time Complexity: O(n)
//    - Single pass through the array
//
// Space Complexity: O(n)
//    - HashMap stores visited elements
// ---------------------------------------------------------

public class LC_219_Contains_Duplicate_II {

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {

                if (map.containsKey(nums[i])) {

                    if (i - map.get(nums[i]) <= k) {
                        return true;
                    }
                }

                map.put(nums[i], i);
            }

            return false;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        Solution obj = new Solution();
        boolean result = obj.containsNearbyDuplicate(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("Contains Nearby Duplicate: " + result);
    }
}