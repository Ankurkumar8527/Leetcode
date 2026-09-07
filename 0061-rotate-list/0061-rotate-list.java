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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n = 1;
        ListNode last = head;
        while(last.next!=null){
            n++;
            last=last.next;
        }
        k%=n;
        if(k==0) return head;
        ListNode tail = head;
        ListNode newHead = head.next;
        int idx = n-k;
        while(idx-->1){
              newHead=newHead.next; 
              tail=tail.next;
        }
        if(tail!=null)
        tail.next=null;
        last.next=head;
        return newHead;
    }
}