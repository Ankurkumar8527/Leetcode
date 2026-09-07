/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        int l1=0,l2=0;
        while(t1!=null){
            t1=t1.next;
            l1++;
        }
        t1=headA;
        while(t2!=null){ 
            t2=t2.next;
            l2++;
        }
        t2=headB;
        int diff = Math.abs(l1-l2);
        if(l1>l2){
            while(diff-->0) t1=t1.next;
        }
        else{
            while(diff-->0) t2=t2.next;
        }
        while(t1!=null){
            if(t1==t2) return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
}