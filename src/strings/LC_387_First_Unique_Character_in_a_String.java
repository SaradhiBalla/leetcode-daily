package strings;

// ---------------------------------------------------------
// Problem: LC 387 - First Unique Character in a String
// Approach: Frequency Array (Two Pass)
//
// Time Complexity: O(n)
//    - First pass: build frequency array
//    - Second pass: find first unique character
//
// Space Complexity: O(1)
//    - Fixed array of size 26
// ---------------------------------------------------------

public class LC_387_First_Unique_Character_in_a_String {

    static class Solution {
        public int firstUniqChar(String s) {

            int[] frequency = new int[26];

            // Count frequency of each character
            for (int i = 0; i < s.length(); i++) {
                frequency[s.charAt(i) - 'a']++;
            }

            // Find first character with frequency 1
            for (int i = 0; i < s.length(); i++) {
                if (frequency[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "leetcode";

        Solution obj = new Solution();
        int result = obj.firstUniqChar(s);

        System.out.println("Input: " + s);
        System.out.println("First Unique Character Index: " + result);
    }
}