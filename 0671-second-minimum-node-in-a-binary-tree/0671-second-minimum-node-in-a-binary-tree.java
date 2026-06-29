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
     public void inorder(TreeNode root,List<Long> ele){
        if(root==null) return;
        inorder(root.left,ele);
        ele.add((long)root.val);
        inorder(root.right,ele);
    }
    public int findSecondMinimumValue(TreeNode root) {
        List<Long> ele = new ArrayList<>();
        inorder(root,ele);
        int n = ele.size()-1;
        Collections.sort(ele);
       for(int i=0;i<n;i++){
        if(ele.get(i).intValue()!=ele.get(i+1).intValue()) return ele.get(i+1).intValue();
       }
       return -1;
    }
}