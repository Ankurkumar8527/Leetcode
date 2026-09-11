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
    int sum; 
    public int CountNode(TreeNode root){
        if(root==null) return 0;
        sum+=root.val;
        return 1+CountNode(root.left)+CountNode(root.right);
    }
    public void helper(TreeNode root,int[] ans){
        if(root==null) return;
        sum = 0;
        int n = CountNode(root);
        int avg = sum/n;
        if(avg == root.val) ans[0]++;
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public int averageOfSubtree(TreeNode root) {
        int[] ans =  new int[1];
        helper(root,ans);
        return ans[0];
    }
}