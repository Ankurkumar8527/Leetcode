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
    class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode node,int val){
            this.node=node;
            this.val=val;
        }
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public List<List<Integer>> BFS(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int h = level(root)-1;
        for(int i=0;i<=h;i++) ans.add(new ArrayList<>());
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair temp = q.remove();
            int level =  temp.val;
            ans.get(ans.size()-1-level).add(temp.node.val);
            if(temp.node.left!=null) q.add(new Pair(temp.node.left,level+1));
            if(temp.node.right!=null) q.add(new Pair(temp.node.right,level+1));
        }
        return ans;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return BFS(root);
    }
}