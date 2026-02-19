package arrays;

import java.util.Arrays;
// Approach: Two Pointer (In-place swap)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LC_344_Reverse_String {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        // Hardcoded test case
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        LC_344_Reverse_String obj =
                new LC_344_Reverse_String();

        System.out.println("Before: " + Arrays.toString(s));

        obj.reverseString(s);

        System.out.println("After:  " + Arrays.toString(s));
    }
}
