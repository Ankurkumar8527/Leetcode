class Solution {
    public TreeNode helper(int[] preorder, int[] inorder,int prelo,int prehi,int inlo,int inhi,HashMap<Integer,Integer> map){
        if(prelo>prehi || inlo>inhi) return null;
        TreeNode root =  new TreeNode(preorder[prelo]);
        int r =  map.get(preorder[prelo]);
        int lSize = r-inlo;
        root.left = helper(preorder,inorder,prelo+1,prelo+lSize,inlo,r-1,map);
        root.right = helper(preorder,inorder,prelo+lSize+1,prehi,r+1,inhi,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(inorder[i],i);
        return helper(preorder,inorder,0,n-1,0,n-1,map);
    }
}