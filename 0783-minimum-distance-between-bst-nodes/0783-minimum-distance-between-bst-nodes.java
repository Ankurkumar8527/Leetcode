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
    TreeNode prev = null;
    int ans = Integer.MAX_VALUE;
    public void DFS(TreeNode root){
        if(root==null) return;
        DFS(root.left);
        if(prev!=null) ans = Math.min(ans,root.val-prev.val);
        prev=root;
        DFS(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        DFS(root); 
        return ans;
    }
}