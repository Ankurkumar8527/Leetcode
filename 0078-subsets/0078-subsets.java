class Solution {
    public void helper(int idx,int[] nums,List<Integer> path,List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));
        for(int i=idx;i<nums.length;i++){
            path.add(nums[i]);
            helper(i+1,nums,path,ans);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}