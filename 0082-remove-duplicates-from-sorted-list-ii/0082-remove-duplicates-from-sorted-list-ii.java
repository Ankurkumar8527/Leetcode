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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        ListNode temp = head;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(temp!=null){
            int key = temp.val;
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
            temp=temp.next;
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                t.next = new ListNode(key);
                t=t.next;
            }
        }
        return ans.next;
    }
}