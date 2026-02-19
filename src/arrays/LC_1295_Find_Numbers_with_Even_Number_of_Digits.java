package arrays;

import java.util.Arrays;
// Approach: Count digits using division
// Time Complexity: O(n * d)  ≈ O(n)
// Space Complexity: O(1)

public class LC_1295_Find_Numbers_with_Even_Number_of_Digits {

    public int findNumbers(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int count = 0;

            while (num > 0) {
                count++;
                num = num / 10;
            }

            if (count % 2 == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Hardcoded test case
        int[] nums = {12, 345, 2, 6, 7896};

        LC_1295_Find_Numbers_with_Even_Number_of_Digits obj =
                new LC_1295_Find_Numbers_with_Even_Number_of_Digits();

        int result = obj.findNumbers(nums);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Count of Even-Digit Numbers: " + result);
    }
}
