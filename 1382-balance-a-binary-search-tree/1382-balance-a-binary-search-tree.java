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
    public void DFS(TreeNode root,List<Integer> arr){
        if(root==null) return;
        DFS(root.left,arr);
        arr.add(root.val);
        DFS(root.right,arr);
    }
    public TreeNode BST(List<Integer> arr,int i,int j){
        if(i>j) return null;
        int mid = i+(j-i)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left=BST(arr,i,mid-1);
        root.right=BST(arr,mid+1,j);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        DFS(root,arr);
        // Collections.sort(arr);
        return BST(arr,0,arr.size()-1);
    }
}