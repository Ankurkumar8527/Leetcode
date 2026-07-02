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
    public TreeNode iop(TreeNode root){
            if(root==null) return null;
            TreeNode temp = root.left;
            while(temp.right!=null) temp=temp.right;
            return temp;
    }
    public TreeNode parent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp = root.left;
        while(temp.right!=pred) temp=temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
                // case 1 : 0 child node 
                if(root.left==null && root.right==null) return null;
                // Case 2 : only one child 
                else if(root.left==null || root.right==null){
                    if(root.left==null) return root.right;
                    else return root.left;
                }
                // Case 3 : Having 2 Child Node 
                else{
                    TreeNode pred = iop(root);
                    TreeNode parentpred = parent(root,pred);
                    if(root==parentpred){
                        pred.right=root.right;
                        return pred;
                    }
                    parentpred.right=pred.left;
                    pred.left=root.left;
                    pred.right=root.right;
                    return pred;
                }
        }
        else if(root.val>key) root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);
        return root;
    }
}