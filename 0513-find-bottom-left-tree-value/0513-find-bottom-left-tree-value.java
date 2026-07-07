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
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public void LeftValue(TreeNode root,int n,int x,int[] ans){
        if(root==null) return;
        if(n==x && root!=null) ans[0]=root.val;
        LeftValue(root.right,n,x+1,ans);
        LeftValue(root.left,n,x+1,ans);    
    }   
    public int findBottomLeftValue(TreeNode root) {
        int[] ans = new int[1];
        int n = levels(root)-1;
        LeftValue(root,n,0,ans);
        return ans[0];
    }
}