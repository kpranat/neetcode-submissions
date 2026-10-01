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
    public void reorderList(ListNode head) {
        int index = 1;
        int i = 1;
        ListNode temp = head;
        ArrayList <Integer> orgArray = new ArrayList<>();
        while (temp!=null){
            orgArray.add(temp.val);
            temp = temp.next;
        }
        int sizeOfArray = orgArray.size();
        int[] resultArray = new int[sizeOfArray];
        int[] orgArray1 = orgArray.stream().mapToInt(Integer::intValue).toArray();
        resultArray[0] = orgArray1[0];
        while (i<sizeOfArray){
            resultArray[i] = orgArray1[sizeOfArray-index];
            if(i==sizeOfArray-1){
                break;
            }
            i++;
            resultArray[i] = orgArray1[index];
            i++;
            index++;

        }
        ListNode curr = head;
        for(int j = 0 ; j<sizeOfArray ; j++){
            curr.val = resultArray[j];
            curr = curr.next;

        }

        
    }
}
