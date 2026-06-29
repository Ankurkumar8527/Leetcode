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
    public void inorder(TreeNode root,List<Integer> ele){
        if(root==null) return;
        inorder(root.left,ele);
        ele.add(root.val);
        inorder(root.right,ele);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ele = new ArrayList<>();
        inorder(root,ele);
        return ele.get(k-1);
    }
}