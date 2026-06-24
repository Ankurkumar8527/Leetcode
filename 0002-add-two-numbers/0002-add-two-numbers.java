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
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        while(temp1!=null || temp2!=null)
        {
            int sum = 0;
            int val1=0,val2=0;
            if(temp1!=null)val1 = temp1.val;
            if(temp2!=null)val2 = temp2.val;
            if(carry!=0) sum=val1+val2+carry;
            else sum=val1+val2;
            if(sum>9){
                carry = sum/10;
                sum=sum%10;
            }
            else carry = 0;
            t.next = new ListNode(sum);
            t=t.next;
            if(temp1!=null) temp1=temp1.next;
             if(temp2!=null) temp2=temp2.next;
        }
        if(carry!=0)
        t.next=new ListNode(carry);
        t=t.next;
        ans=ans.next;
        return ans;
    }
}