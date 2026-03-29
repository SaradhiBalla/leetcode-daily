package recursion;

// ---------------------------------------------------------
// Problem: LC 509 - Fibonacci Number
// Approach: Recursion
//
// Time Complexity: O(2^n)
//    - Each call branches into two recursive calls
//
// Space Complexity: O(n)
//    - Due to recursion call stack
// ---------------------------------------------------------

public class LC_509_Fibonacci_Number {

    static class Solution {
        public int fib(int n) {

            if (n <= 1) {
                return n;
            }

            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int n = 6;

        Solution obj = new Solution();
        int result = obj.fib(n);

        System.out.println("n: " + n);
        System.out.println("Fibonacci Number: " + result);
    }
}