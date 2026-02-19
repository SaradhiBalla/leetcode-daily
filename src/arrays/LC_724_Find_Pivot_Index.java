package arrays;

import java.util.Arrays;

public class LC_724_Find_Pivot_Index {

    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            int right = sum - left - nums[i];

            if (right == left) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        // Hardcoded test case
        int[] nums = {1, 7, 3, 6, 5, 6};

        LC_724_Find_Pivot_Index obj =
                new LC_724_Find_Pivot_Index();

        int result = obj.pivotIndex(nums);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Pivot Index: " + result);
    }
}
