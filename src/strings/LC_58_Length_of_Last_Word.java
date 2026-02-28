package strings;

// ---------------------------------------------------------
// Problem: LC 58 - Length of Last Word
// Approach: Reverse Traversal
//
// Time Complexity: O(n)
//    - In worst case, traverse entire string once
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_58_Length_of_Last_Word {

    static class Solution {
        public int lengthOfLastWord(String s) {

            int length = 0;
            int i = s.length() - 1;

            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Count characters of last word
            while (i >= 0 && s.charAt(i) != ' ') {
                length++;
                i--;
            }

            return length;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "Hello World";

        Solution obj = new Solution();
        int result = obj.lengthOfLastWord(s);

        System.out.println("Input: \"" + s + "\"");
        System.out.println("Length of Last Word: " + result);
    }
}