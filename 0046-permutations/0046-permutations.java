class Solution {
    public void helper(int i,int n,int[] nums,List<Integer> comb,List<List<Integer>> ans){
        if(i==n){
            if(!ans.contains(comb)){
                ans.add(new ArrayList<>(comb));
                return;
            }
        }
        for(int idx=0;idx<n;idx++){
            if(!comb.contains(nums[idx])){
                comb.add(nums[idx]);
                helper(i+1,n,nums,comb,ans);
                comb.remove(comb.size()-1);
            } 
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,n,nums,new ArrayList<>(),ans);
        return ans;
    }
}