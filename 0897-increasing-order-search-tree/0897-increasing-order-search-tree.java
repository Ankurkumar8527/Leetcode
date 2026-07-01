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
    public void DFS(TreeNode root, List<Integer> arr){
        if(root==null) return;
        DFS(root.left,arr);
        arr.add(root.val);
        DFS(root.right,arr);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        DFS(root,arr);
        TreeNode ans = new TreeNode(arr.get(0));
        TreeNode temp = ans;
        for(int i=1;i<arr.size();i++) {
            temp.right=new TreeNode(arr.get(i));
            temp=temp.right;
        }
        return ans;
    }
}