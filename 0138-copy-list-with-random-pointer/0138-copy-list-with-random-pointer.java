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
        if(head==null) return head;
        Node head2 = new Node(head.val);
        Node temp2 = head2;
        Node temp = head.next;
        while(temp!=null){
            Node dup = new Node(temp.val);
            temp2.next=dup;
            temp2=temp2.next;
            temp=temp.next;
        }
        HashMap<Node,Node> map = new HashMap<>();
        temp2=head2;
        temp=head;
        while(temp!=null){
            map.put(temp,temp2);
            temp2=temp2.next;
            temp=temp.next;
        }
        temp2=head2;
        for(Node key : map.keySet()){
            Node dup = map.get(key);
            if(key.random!=null) 
            dup.random=map.get(key.random);
        }
        return head2;
    }
}