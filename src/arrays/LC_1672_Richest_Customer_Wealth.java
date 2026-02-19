package arrays;

import java.util.Arrays;

public class LC_1672_Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // Hardcoded 2D array (customers × bank accounts)
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 1, 2}
        };

        LC_1672_Richest_Customer_Wealth obj =
                new LC_1672_Richest_Customer_Wealth();

        int result = obj.maximumWealth(accounts);

        System.out.println("Accounts: " + Arrays.deepToString(accounts));
        System.out.println("Maximum Wealth: " + result);
    }
}
