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
        // using Stack with using temp variable to check null value;
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp!=null){
                s.push(temp);
                temp=temp.left;
            }
            else{
                if(s.isEmpty()) break;
                TreeNode top = s.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }
        return ans;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return DFS(root);
    }
}