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
    class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode node,int val){
            this.node = node;
            this.val=val;
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        int n = levels(root)-1;
        if(n==0) return root.val;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.val;
            TreeNode temp = front.node;
            if(n==level) return temp.val;
            if(temp.left!=null) q.add(new Pair(temp.left,level+1));
            if(temp.right!=null) q.add(new Pair(temp.right,level+1));
        }
        return 0;
    }
}