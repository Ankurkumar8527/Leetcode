class Solution {
    public void subset(int i,int n,int[] nums,List<Integer> sub,List<List<Integer>> ans){
        if(i==n){
            if(!ans.contains(sub)) ans.add(new ArrayList<>(sub));
            return;
        }
        
        // take 
        sub.add(nums[i]);
        subset(i+1,n,nums,sub,ans);
        sub.remove(sub.size()-1);
        // skip 
        subset(i+1,n,nums,sub,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,n,nums,new ArrayList<>(),ans);
        return ans;
    }
}