public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            // Move slow pointer by one step
            slow = slow.next;
            // Move fast pointer by two steps
            fast = fast.next.next;

            // If the slow and fast pointers meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If the fast pointer reaches the end, there is no cycle
        return false;
    }
}