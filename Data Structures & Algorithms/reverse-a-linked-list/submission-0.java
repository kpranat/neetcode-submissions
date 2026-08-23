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
        ListNode forward = head;
        ListNode prev = null;       

        while (forward!=null){
            ListNode nextTemp = forward.next;
            forward.next=prev;
            prev = forward;
            forward = nextTemp;            
        }
        return prev;
        
    }
}
