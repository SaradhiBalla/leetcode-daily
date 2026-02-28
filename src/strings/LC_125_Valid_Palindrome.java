package strings;

// ---------------------------------------------------------
// Problem: LC 125 - Valid Palindrome
// Approach: Two Pointer with Character Filtering
//
// Time Complexity: O(n)
//    - Each character processed at most once
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_125_Valid_Palindrome {

    static class Solution {
        public boolean isPalindrome(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                // Skip non-alphanumeric characters
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                // Compare characters ignoring case
                if (Character.toLowerCase(s.charAt(left))
                        != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String s = "A man, a plan, a canal: Panama";

        Solution obj = new Solution();
        boolean result = obj.isPalindrome(s);

        System.out.println("Input: \"" + s + "\"");
        System.out.println("Is Palindrome: " + result);
    }
}