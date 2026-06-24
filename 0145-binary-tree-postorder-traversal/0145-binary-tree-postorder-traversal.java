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
    public List<Integer> DFS(TreeNode root){
        // Using Stack and concept of reversePreorder
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        if(root!=null) s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp = s1.pop();
            ans.add(0,temp.val);
            if(temp.left!=null) s1.push(temp.left);
            if(temp.right!=null) s1.push(temp.right);
        }
        return ans;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        return DFS(root);
    }
}