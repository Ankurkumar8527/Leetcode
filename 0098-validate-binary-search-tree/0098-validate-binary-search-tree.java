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
    public boolean isValidBST(TreeNode root) {
        // Morris Traversal
        TreeNode curr=root;
        TreeNode prev=null;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                else{ // pred.right==curr
                    if(prev!=null && prev.val>=curr.val) return false;
                    prev=curr;
                    curr=curr.right;
                    pred.right=null;
                }
            }
            else{
                if(prev!=null && prev.val>=curr.val) return false;
                prev=curr;
                curr=curr.right;
            }
        }
        return true;
    }
}