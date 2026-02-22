package strings;

// ---------------------------------------------------------
// Problem: LC 771 - Jewels and Stones
// Approach: Brute Force (Double Loop)
//
// Time Complexity: O(n × m)
//    - For each jewel, we traverse all stones
//
// Space Complexity: O(1)
//    - No extra data structure used
// ---------------------------------------------------------

public class LC_771_Jewels_and_Stones {

    static class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            int count = 0;

            for (int i = 0; i < jewels.length(); i++) {
                for (int j = 0; j < stones.length(); j++) {
                    if (jewels.charAt(i) == stones.charAt(j)) {
                        count++;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        String jewels = "aA";
        String stones = "aAAbbbb";

        Solution obj = new Solution();
        int result = obj.numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels in Stones: " + result);
    }
}
