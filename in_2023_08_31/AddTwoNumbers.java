/*
LEETCODE JAVA CHALLANGES: 2. ADD TWO NUMBERS
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

package in_2023_08_31;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers {

    public List<ListNode> combined = new LinkedList<>();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);   // Create a dummy node to simplify code
        ListNode current = dummyHead;               // 'current' will point to the last node in the new list
        int carry = 0;                              // Initialize carry variable
        int x, y;                                   // Declare variables to store node values


        while (l1 != null || l2 != null) {          // Loop to go through each node of both lists
                                                    // Store l1 and l2 values into x and y
            if (l1 != null) {                       // If l1 or l2 is null, use 0 instead
                x = l1.val;
            } else {
                x = 0;
            }

            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }

            int sum = x + y + carry;                // Calculate the sum and new carry
            carry = sum / 10;

            // Create a new node with the remainder and append it to the new list
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes for l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // In case there's a remaining carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Skip the dummy head and return the new list
        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Initialize linked lists l1 = [2, 4, 3] and l2 = [5, 6, 4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Call addTwoNumbers and store the result in a new list
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if (result != null) {
                System.out.print(" -> ");
            }
        }
    }
}

