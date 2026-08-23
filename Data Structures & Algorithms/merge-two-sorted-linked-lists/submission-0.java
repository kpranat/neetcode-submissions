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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode sortedList;
        if (l1.val<=l2.val){
            sortedList = l1;
            l1=l1.next;
        }else {
            sortedList = l2;
            l2=l2.next;
        }
        ListNode temp = sortedList;
        while (l1!=null && l2!=null){
            if (l1.val < l2.val){
                temp.next = l1;
                l1=l1.next; 
                temp = temp.next;        
                       
            }
            else if (l1.val>l2.val){
                temp.next = l2;
                l2=l2.next;
                temp = temp.next;
                

            }
            else{
                temp.next = l1;
                l1=l1.next;
                temp = temp.next; 

                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
                
            }           


        }
        while (l1!=null){
            temp.next=l1;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            temp.next =l2;
            temp = temp.next;
            l2=l2.next;
        }
        
        return sortedList;

        
    }
}