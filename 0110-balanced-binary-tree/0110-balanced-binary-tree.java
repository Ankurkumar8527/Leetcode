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
    boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        if(Math.abs(leftlevels-rightlevels)>1) ans = false;
        return 1+Math.max(leftlevels,rightlevels);
    }
    public boolean isBalanced(TreeNode root) {
        // Optimal Approach
        ans = true;
        levels(root);
        return ans;
    }
}