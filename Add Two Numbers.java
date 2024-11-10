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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int c = 0;
        while (l1 != null || c != 0 || l2 != null) {
            int d1;
            int d2;
            if (l1 != null) {
                d1 = l1.val;
                l1 = l1.next;
            } else {
                d1 = 0;
            }
            if (l2 != null) {
                d2 = l2.val;
                l2 = l2.next;
            } else {
                d2 = 0;
            }
            int sum = d1 + d2 + c;
            int d = sum % 10;
            c = sum / 10;
            ListNode newNode = new ListNode(d);
            tail.next = newNode;
            tail = tail.next;
        }
        ListNode result = dummy.next;
        dummy.next = null;
        return result;

    }
}