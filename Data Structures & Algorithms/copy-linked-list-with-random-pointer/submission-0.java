/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> nodeMap =new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            nodeMap.put(temp,newNode);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null){
            nodeMap.get(temp).next = nodeMap.get(temp.next);
            nodeMap.get(temp).random = nodeMap.get(temp.random);
            temp=temp.next;
        }
        return nodeMap.get(head);
        
    }
}
