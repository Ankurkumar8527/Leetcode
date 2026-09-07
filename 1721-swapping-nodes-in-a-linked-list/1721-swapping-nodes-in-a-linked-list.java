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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s = head;
        ListNode f = head;
        for(int i=1;i<k;i++) f=f.next;

        ListNode temp = f;
        while(temp.next!=null) {
            s=s.next;
            temp=temp.next;
        }
        int x = s.val;
        s.val=f.val;
        f.val=x;
        return head;
    }
}