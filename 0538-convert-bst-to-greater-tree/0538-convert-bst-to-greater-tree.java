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
    int x;
     public void reverseInorder(TreeNode root) {
        if(root==null) return;
        reverseInorder(root.right);
        root.val+=x;
        x=root.val;
        reverseInorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        x=0;
        reverseInorder(root);
        return root;
    }
}