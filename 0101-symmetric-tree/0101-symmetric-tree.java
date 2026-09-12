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
    public TreeNode Invert(TreeNode root) {
        if(root==null) return root;
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
        Invert(root.left);
        Invert(root.right);
        return root;
    }
    public boolean Sametree(TreeNode p,TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if((Sametree(p.left,q.left))==false) return false;
        if((Sametree(p.right,q.right))==false) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        root.right = Invert(root.right);
        return Sametree(root.left,root.right);
    }
}