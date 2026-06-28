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
    public TreeNode helper(int[] inorder, int[] postorder,int inlo,int inhi,int postlo,int posthi, HashMap<Integer,Integer> map){
        if(inlo>inhi || postlo>posthi) return null;
        TreeNode root = new TreeNode(postorder[posthi]);
        int r = map.get(postorder[posthi]);
        int lSize = r-inlo;
        root.left = helper(inorder,postorder,inlo,r-1,postlo,postlo+lSize-1,map);
        root.right = helper(inorder,postorder,r+1,inhi,postlo+lSize,posthi-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(inorder[i],i);
        return helper(inorder,postorder,0,n-1,0,n-1,map);
    }
}