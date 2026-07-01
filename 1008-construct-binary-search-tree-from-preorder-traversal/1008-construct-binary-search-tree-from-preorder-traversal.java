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
     public TreeNode BST(int[] preorder,int i,int j) {
        if(i>j) return null;
        TreeNode root = new TreeNode(preorder[i]);
        int k = i+1;
        while(k<=j && preorder[k]<root.val) k++;
        root.left=BST(preorder,i+1,k-1);
        root.right=BST(preorder,k,j);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return BST(preorder,0,preorder.length-1);
    }
}