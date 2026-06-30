/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean exists(TreeNode root, TreeNode node){
        if(root==node) return true;
        if(root==null) return false;
        return exists(root.left,node) || exists(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean plies = exists(root.left,p);
        boolean qlies = exists(root.left,q);
        if(plies && qlies) return lowestCommonAncestor(root.left,p,q);
        if(!plies && !qlies) return lowestCommonAncestor(root.right,p,q);
        return root;   
    }
}