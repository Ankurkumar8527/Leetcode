class Solution {
    public void combination(int i,int n,int target,int[] nums,List<Integer> path,List<List<Integer>> ans){
        if(target==0){
           ans.add(new ArrayList<>(path));
            return;
        }
        if(target<0) return;
        if(i>=n) return;
        path.add(nums[i]);
        combination(i+1,n,target-nums[i],nums,path,ans);
        path.remove(path.size()-1);

        while(i+1<n && nums[i]==nums[i+1])
        i++;
        combination(i+1,n,target,nums,path,ans);
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        combination(0,n,target,nums,new ArrayList<>(),ans);
        return ans;
    }
}