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
    public List<Integer> BFS(TreeNode root){
            // Using Stack
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root!=null) s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            ans.add(temp.val);
            if(temp.right!=null) s.push(temp.right);
            if(temp.left!=null) s.push(temp.left);
        }
        return ans;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return BFS(root);
    }
}