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
    public void Sum(TreeNode root, int low,int high,int[] arr){
        if(root==null) return;
        if(root.val>=low && root.val<=high) arr[0]+=root.val;
        if(root.left!=null)    Sum(root.left,low,high,arr);
        if(root.right!=null)    Sum(root.right,low,high,arr);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] arr = new int[1];
        Sum(root,low,high,arr);
        return arr[0];
    }
}