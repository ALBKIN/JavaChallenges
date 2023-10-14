/*
LEETCODE JAVA CHALLENGES: 83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package in_2023_10_14;

public class RemoveSortedListDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        // If the head is null or there's only one element just return the head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the linked list
        while (current != null && current.next != null) {
            // If the value of the current node is equal to the value of the next node
            // then we skip the next node (remove duplicate).
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static class ListNode {
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

    public static void main(String[] args) {
        // Create two sample linked lists
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        // Remove duplicates
        head1 = new RemoveSortedListDuplicates().deleteDuplicates(head1);
        head2 = new RemoveSortedListDuplicates().deleteDuplicates(head2);

        // Print results
        printList(head1); // Expected output: 1->2
        printList(head2); // Expected output: 1->2->3
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("null");
    }
}
