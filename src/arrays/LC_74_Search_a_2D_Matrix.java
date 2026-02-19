package arrays;

import java.util.Arrays;
// Approach: Brute Force
// Time Complexity: O(m * n)
// Space Complexity: O(1)

public class LC_74_Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Hardcoded 2D matrix
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        LC_74_Search_a_2D_Matrix obj =
                new LC_74_Search_a_2D_Matrix();

        boolean result = obj.searchMatrix(matrix, target);

        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("Target: " + target);
        System.out.println("Found: " + result);
    }
}
