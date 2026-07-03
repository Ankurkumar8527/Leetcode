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
    public void Morris(TreeNode root,List<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        Morris(root.left,arr);
        Morris(root.right,arr);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        List<Integer> arr = new ArrayList<>();
        TreeNode curr=root;
        Morris(curr,arr);
        root.left=null;
        root.right=null;
        int k = 1;
        TreeNode temp = root;
        for(int val : arr){
            if(val==root.val && k>0) {
                k--;
                continue;}
            temp.right=new TreeNode(val);
            temp=temp.right;
        }
    }
}