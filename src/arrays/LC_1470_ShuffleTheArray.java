package arrays;

import java.util.Arrays;
// Approach: Direct index mapping
// Time Complexity: O(n)
// Space Complexity: O(n)  (extra result array)

public class LC_1470_ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }

    public static void main(String[] args) {

        // Hardcoded input
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
