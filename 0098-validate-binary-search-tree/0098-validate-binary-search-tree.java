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
    boolean flag;
    public long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long b=max(root.left);
        if(root.val<=b) flag = false;
        long c=max(root.right);
        return Math.max(root.val,Math.max(b,c));
    }
    public long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long b=min(root.left),
        c=min(root.right);
        if(root.val>=c) flag = false;
        return Math.min(root.val,Math.min(b,c));
    }
    public boolean isValidBST(TreeNode root) {
        flag=true;
        max(root);
        min(root);
        return flag;
    }
}