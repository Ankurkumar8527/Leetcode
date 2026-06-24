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
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node = node;
            this.level=level;
        }
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        int h = levels(root);
        for(int i=0;i<h;i++) ans.add(new ArrayList<>());
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair f = q.remove();
            int level = f.level;

            if(level%2!=0) ans.get(level).add(0,f.node.val);
            else ans.get(level).add(f.node.val);

            if(f.node.left!=null) q.add(new Pair(f.node.left,level+1));
            if(f.node.right!=null) q.add(new Pair(f.node.right,level+1));
        }

        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return BFS(root);
    }
}