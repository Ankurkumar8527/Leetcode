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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode BST(List<Integer> nums,int i,int j){
        if(i>j) return null;
        int mid = i +(j-i)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left=BST(nums,i,mid-1);
        root.right=BST(nums,mid+1,j);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head=head.next;
        }
        return BST(nums,0,nums.size()-1);
    }
}