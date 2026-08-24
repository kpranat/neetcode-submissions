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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        if(count == 1){
            return null;
        }
        int countTillDeletion = count-n;
        temp = head;
        count = 0;
        if (countTillDeletion == 0){
            return head.next;
        }
        while (temp!=null){
            count++;
            if (count == countTillDeletion){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}
