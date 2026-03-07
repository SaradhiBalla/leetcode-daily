package strings;

import java.util.HashMap;

// ---------------------------------------------------------
// Problem: LC 13 - Roman to Integer
// Approach: HashMap + Lookahead Comparison
//
// Time Complexity: O(n)
//    - Traverse the string once
//
// Space Complexity: O(1)
//    - Fixed map of Roman symbols
// ---------------------------------------------------------

public class LC_13_Roman_to_Integer {

    static class Solution {
        public int romanToInt(String s) {

            HashMap<Character, Integer> map = new HashMap<>();

            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;

            for (int i = 0; i < s.length(); i++) {

                int current = map.get(s.charAt(i));

                if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                    result = result - current;
                } else {
                    result = result + current;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "MCMXCIV";

        Solution obj = new Solution();
        int result = obj.romanToInt(s);

        System.out.println("Roman: " + s);
        System.out.println("Integer: " + result);
    }
}