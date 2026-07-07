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
    public int BFS(TreeNode root){
        Queue<Pair> q = new LinkedList<>();
        int n = levels(root)-1;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.val;
            if(n==level) return front.node.val;
            if(front.node.left!=null) q.add(new Pair(front.node.left,level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,level+1));
        }
        return 0;
    }   
    public int findBottomLeftValue(TreeNode root) {
        return BFS(root);
    }
}