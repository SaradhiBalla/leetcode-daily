package strings;

import java.util.Arrays;
import java.util.HashMap;

// ---------------------------------------------------------
// Problem: LC 290 - Word Pattern
// Approach: Bidirectional HashMap
//
// Time Complexity: O(n)
//    - Traverse words and pattern once
//
// Space Complexity: O(n)
//    - HashMaps store mappings between pattern and words
// ---------------------------------------------------------

public class LC_290_Word_Pattern {

    static class Solution {
        public boolean wordPattern(String pattern, String s) {

            String[] c = s.split(" ");

            if (pattern.length() != c.length) {
                return false;
            }

            HashMap<Character, String> map1 = new HashMap<>();
            HashMap<String, Character> map2 = new HashMap<>();

            for (int i = 0; i < c.length; i++) {

                char z = pattern.charAt(i);
                String b = c[i];

                if (map1.containsKey(z) && !map1.get(z).equals(b)) {
                    return false;
                }

                if (map2.containsKey(b) && map2.get(b) != z) {
                    return false;
                }

                map1.put(z, b);
                map2.put(b, z);
            }

            return true;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String pattern = "abba";
        String s = "dog cat cat dog";

        Solution obj = new Solution();
        boolean result = obj.wordPattern(pattern, s);

        System.out.println("Pattern: " + pattern);
        System.out.println("String: " + s);
        System.out.println("Follows Pattern: " + result);
    }
}