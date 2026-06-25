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
    int ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int y = levels(root.left);
        int z = levels(root.right);
        int x = y+z;
        ans = Math.max(x,ans);
        return 1+Math.max(y,z);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        ans = 0;
        levels(root);
        return ans;
    }
}