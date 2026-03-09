package strings;

import java.util.HashMap;

// ---------------------------------------------------------
// Problem: LC 383 - Ransom Note
// Approach: HashMap Frequency Count
//
// Time Complexity: O(n + m)
//    - Build frequency map for magazine
//    - Traverse ransomNote
//
// Space Complexity: O(1)
//    - At most 26 lowercase letters
// ---------------------------------------------------------

public class LC_383_Ransom_Note {

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {

            int ransom_length = ransomNote.length();
            int magazine_length = magazine.length();

            if (ransom_length > magazine_length) {
                return false;
            }

            HashMap<Character, Integer> map = new HashMap<>();

            // Count characters in magazine
            for (int i = 0; i < magazine_length; i++) {
                char c = magazine.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Check ransomNote characters
            for (int i = 0; i < ransom_length; i++) {

                char c = ransomNote.charAt(i);

                if (!map.containsKey(c) || map.get(c) == 0) {
                    return false;
                }

                map.put(c, map.get(c) - 1);
            }

            return true;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String ransomNote = "aa";
        String magazine = "aab";

        Solution obj = new Solution();
        boolean result = obj.canConstruct(ransomNote, magazine);

        System.out.println("Ransom Note: " + ransomNote);
        System.out.println("Magazine: " + magazine);
        System.out.println("Can Construct: " + result);
    }
}