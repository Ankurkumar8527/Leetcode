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
        int n = 0;
        ListNode temp = head;
        while(temp!=null) {
            n++;
            temp=temp.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        int a = n-k;
        int b = k-1;
        while(a-->0) slow=slow.next;
        while(b-->0) fast=fast.next;
        int t = slow.val;
        slow.val = fast.val;
        fast.val=t;
        return head;
    }
}