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
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        int n = levels(root);
        for(int i=0;i<n;i++)    ans.add(new ArrayList<>());
        Queue<Pair> q = new LinkedList<>();
        int prevlevel=0;
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.level;
            ans.get(level).add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,level+1));
        }
        return ans;

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        return BFS(root);
    }
}