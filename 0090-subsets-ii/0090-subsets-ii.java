class Solution {
    public void subset(int idx,int[] nums,List<Integer> sub,List<List<Integer>> ans){
       ans.add(new ArrayList<>(sub));
       
       for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue;
             // take 
            sub.add(nums[i]);
            subset(i+1,nums,sub,ans);
            sub.remove(sub.size()-1);
       }   

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}