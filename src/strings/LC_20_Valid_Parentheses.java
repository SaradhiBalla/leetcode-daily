package strings;

import java.util.Stack;

// ---------------------------------------------------------
// Problem: LC 20 - Valid Parentheses
// Approach: Stack
//
// Time Complexity: O(n)
//    - Each character processed once
//
// Space Complexity: O(n)
//    - Stack stores opening brackets
// ---------------------------------------------------------

public class LC_20_Valid_Parentheses {

    static class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                }
                else {

                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if (s.charAt(i) == ')' && top != '(') return false;
                    if (s.charAt(i) == '}' && top != '{') return false;
                    if (s.charAt(i) == ']' && top != '[') return false;
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "()[]{}";

        Solution obj = new Solution();
        boolean result = obj.isValid(s);

        System.out.println("Input: " + s);
        System.out.println("Is Valid: " + result);
    }
}