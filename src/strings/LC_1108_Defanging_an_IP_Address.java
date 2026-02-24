package strings;

// ---------------------------------------------------------
// Problem: LC 1108 - Defanging an IP Address
// Approach: String Replace
//
// Time Complexity: O(n)
//    - replace() scans the entire string once
//
// Space Complexity: O(n)
//    - New string created due to immutability
// ---------------------------------------------------------

public class LC_1108_Defanging_an_IP_Address {

    static class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String address = "192.168.0.1";

        Solution obj = new Solution();
        String result = obj.defangIPaddr(address);

        System.out.println("Original: " + address);
        System.out.println("Defanged: " + result);
    }
}