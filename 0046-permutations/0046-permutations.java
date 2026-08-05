class Solution {
    public void helper(int idx,int[] nums,List<Integer> path, List<List<Integer>> ans){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!path.contains(nums[i])){
                path.add(nums[i]);
                helper(i+1,nums,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}