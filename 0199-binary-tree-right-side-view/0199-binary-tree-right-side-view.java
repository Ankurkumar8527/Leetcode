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
    public void postorder(TreeNode root,int level,List<Integer> ans){
        if(root==null) return;
        postorder(root.right,level+1,ans);
        if(ans.get(level)==-101)ans.set(level,root.val);
        postorder(root.left,level+1,ans);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int n = levels(root);
        for(int i=0;i<n;i++) ans.add(-101);
        postorder(root,0,ans);
        return ans;
    }
}