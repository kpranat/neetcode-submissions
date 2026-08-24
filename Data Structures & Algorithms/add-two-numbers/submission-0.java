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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        ListNode solution = new ListNode();
        ListNode tempsol = solution;
        if (temp1.val+temp2.val>9){
            int add = temp1.val+temp2.val;
            tempsol.val = add%10;            
            carry = add/10;            
        }
        else{
            int add = temp1.val+temp2.val;
            tempsol.val = add;
        } 
        temp1=temp1.next;
        temp2=temp2.next;
        while (temp1!=null || temp2!=null || carry>0){
            int add = carry;
            if (temp1!=null){
                add+=temp1.val;
                temp1 = temp1.next;             
            }
            if(temp2!=null){
                add+=temp2.val;
                temp2 = temp2.next;
            }
            carry = add/10;
            tempsol.next = new ListNode(add%10);
            tempsol=tempsol.next;
        }
        return solution;
        
        
    }
}
