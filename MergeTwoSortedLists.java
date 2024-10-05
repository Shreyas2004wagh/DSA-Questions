import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        // Initialize a current node to build the merged list
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            // Compare the nodes from both lists and append the smaller one to the merged
            // list
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            // Move the current node
            current = current.next;
        }

        // Append the remaining nodes of the non-exhausted list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // Return the head of the merged list
        return dummy.next;
    }
}