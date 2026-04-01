package linkedlist;

// ---------------------------------------------------------
// Problem: LC 1721 - Swapping Nodes in a Linked List
// Approach: Find kth node from start and kth node from end
//
// Time Complexity: O(n)
//    - One pass to count nodes
//    - One pass to reach kth nodes
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_1721_Swapping_Nodes_in_a_Linked_List {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode swapNodes(ListNode head, int k) {

            ListNode first = head;
            ListNode second = head;
            ListNode cur = head;

            int count = 0;

            // Count nodes
            while (cur != null) {
                count++;
                cur = cur.next;
            }

            // Find kth node from start
            for (int i = 1; i < k; i++) {
                first = first.next;
            }

            // Find kth node from end
            for (int i = 1; i < count - k + 1; i++) {
                second = second.next;
            }

            // Swap values
            int temp = first.val;
            first.val = second.val;
            second.val = temp;

            return head;
        }
    }

    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        Solution obj = new Solution();
        head = obj.swapNodes(head, k);

        System.out.print("After Swap: ");
        printList(head);
    }
}