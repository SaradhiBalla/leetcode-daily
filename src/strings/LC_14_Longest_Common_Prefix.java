package strings;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 14 - Longest Common Prefix
// Approach: Horizontal Scanning (Character by Character)
//
// Time Complexity: O(n * m)
//    - n = number of strings
//    - m = length of shortest string
//
// Space Complexity: O(m)
//    - For storing result string
// ---------------------------------------------------------

public class LC_14_Longest_Common_Prefix {

    static class Solution {
        public String longestCommonPrefix(String[] strs) {

            String result = "";

            for (int i = 0; i < strs[0].length(); i++) {

                char currentChar = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {

                    if (i >= strs[j].length() ||
                            strs[j].charAt(i) != currentChar) {
                        return result;
                    }
                }

                result = result + currentChar;
            }

            return result;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String[] strs = {"flower", "flow", "flight"};

        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(strs);

        System.out.println("Input: " + Arrays.toString(strs));
        System.out.println("Longest Common Prefix: " + result);
    }
}