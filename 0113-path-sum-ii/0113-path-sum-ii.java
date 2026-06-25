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
    public void helper(TreeNode root,List<Integer> path,int targetSum,List<List<Integer>> ans){
        if(root==null) return;
        path.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0) ans.add(new ArrayList<>(path));
        helper(root.left,path,targetSum,ans);
        helper(root.right,path,targetSum,ans);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,new ArrayList<>(),targetSum,ans);
        return ans;
    }
}