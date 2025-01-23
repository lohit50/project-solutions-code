/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode Middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode Reverse(ListNode head){
        ListNode crnt = head;
        ListNode prev = null;
        ListNode next = null;
        while(crnt != null){
            next = crnt.next;
            crnt.next = prev;
            prev = crnt;
            crnt = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        ListNode middlenode = Middle(head);
        ListNode secondhalf = Reverse(middlenode);
        ListNode firsthalf = head;

        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}