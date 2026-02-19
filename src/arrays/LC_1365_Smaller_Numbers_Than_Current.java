package arrays;

import java.util.Arrays;
import java.util.HashMap;
// Approach: Sort copy + store first occurrence index in HashMap
// Time Complexity: O(n log n)
// Space Complexity: O(n)

public class LC_1365_Smaller_Numbers_Than_Current {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int copy[] = nums.clone();
        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], i);
            }
        }

        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        LC_1365_Smaller_Numbers_Than_Current obj =
                new LC_1365_Smaller_Numbers_Than_Current();

        int[] result = obj.smallerNumbersThanCurrent(nums);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
