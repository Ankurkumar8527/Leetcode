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
    public ListNode partition(ListNode head, int x) {
        ListNode ss = new ListNode(-1);
        ListNode s = ss;
        ListNode ll = new ListNode(-1);
        ListNode l = ll;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val>=x){
                l.next=temp;
                l=l.next;
            }
            else{
                s.next=temp;
                s=s.next;
            }
            temp=temp.next;
        }
        s.next=null;
        l.next=null;
        if(ss.next!=null){
            ss=ss.next;
        }
        else return ll.next;
        if(ll.next!=null) ll=ll.next;
        else return ss;
        s.next=ll;
        return ss;
    }
}