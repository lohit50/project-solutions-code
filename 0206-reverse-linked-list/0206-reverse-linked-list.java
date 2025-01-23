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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode crnt = head;
        ListNode next = null;
        while( crnt != null){
            next = crnt.next;
            crnt.next = prev;
            prev = crnt;
            crnt = next;
        }
    return prev;
    }
}