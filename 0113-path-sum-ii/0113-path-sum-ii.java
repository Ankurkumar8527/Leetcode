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
    public void helper(TreeNode root,int targetSum,List<Integer> path,List<List<Integer>> ans){
        if(root==null) return;
        path.add(root.val);
        targetSum-=root.val;
        if(targetSum==0 && root.left==null && root.right==null)
            ans.add(new ArrayList<>(path));
        helper(root.left,targetSum,path,ans);
        helper(root.right,targetSum,path,ans);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,targetSum,new ArrayList<>(),ans);
        return ans;
    }
}