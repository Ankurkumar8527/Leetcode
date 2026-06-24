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
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public void DFS(TreeNode root,int level,int n, List<Integer> s){
        if(root==null) return;
        if(level>n) return;
        if(level==n) s.add(root.val);
        if(root.left!=null) DFS(root.left,level+1,n,s);
        if(root.right!=null) DFS(root.right,level+1,n,s);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int height = level(root)-1;
        for(int i = height;i>=0;i--){
            List<Integer> s = new ArrayList<>();
            int n = i;
            DFS(root,0,n,s);
            ans.add(new ArrayList<>(s));
        }
        return ans;
    }
}