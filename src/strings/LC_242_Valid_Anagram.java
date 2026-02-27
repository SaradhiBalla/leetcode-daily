package strings;

// ---------------------------------------------------------
// Problem: LC 242 - Valid Anagram
// Approach: Frequency Array Comparison
//
// Time Complexity: O(n)
//    - Single pass to count frequencies
//    - Constant pass of size 26
//
// Space Complexity: O(1)
//    - Fixed size arrays of length 26
// ---------------------------------------------------------

public class LC_242_Valid_Anagram {

    static class Solution {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            int[] s_frequency = new int[26];
            int[] t_frequency = new int[26];

            // Count frequency of s
            for (int i = 0; i < s.length(); i++) {
                s_frequency[s.charAt(i) - 'a']++;
            }

            // Count frequency of t
            for (int i = 0; i < t.length(); i++) {
                t_frequency[t.charAt(i) - 'a']++;
            }

            // Compare both frequency arrays
            for (int i = 0; i < 26; i++) {
                if (s_frequency[i] != t_frequency[i]) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "anagram";
        String t = "nagaram";

        Solution obj = new Solution();
        boolean result = obj.isAnagram(s, t);

        System.out.println("s: " + s);
        System.out.println("t: " + t);
        System.out.println("Is Anagram: " + result);
    }
}