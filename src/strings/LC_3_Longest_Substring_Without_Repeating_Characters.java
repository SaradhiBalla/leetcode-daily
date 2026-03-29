package strings;

import java.util.HashSet;

// ---------------------------------------------------------
// Problem: LC 3 - Longest Substring Without Repeating Characters
// Approach: Sliding Window + HashSet
//
// Time Complexity: O(n)
//    - Each character processed at most twice
//
// Space Complexity: O(min(n, charset))
//    - HashSet stores unique characters in window
// ---------------------------------------------------------

public class LC_3_Longest_Substring_Without_Repeating_Characters {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {

            HashSet<Character> set = new HashSet<>();
            int left = 0;
            int length = 0;

            for (int right = 0; right < s.length(); right++) {

                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(right));

                length = Math.max(length, right - left + 1);
            }

            return length;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "abcabcbb";

        Solution obj = new Solution();
        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Input: " + s);
        System.out.println("Longest Substring Length: " + result);
    }
}