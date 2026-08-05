class Solution {
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void helper(int idx,int n,int[] nums, List<List<Integer>>  ans){
        if(idx==n){
            List<Integer> path = new ArrayList<>();
            for(int i=0;i<n;i++){
                path.add(nums[i]);
            }
            if(!ans.contains(path))
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<n;i++){
                swap(nums,i,idx);
                helper(idx+1,n,nums,ans);
                swap(nums,i,idx); 
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>>  ans = new ArrayList<>();
        helper(0,n,nums,ans);
        return ans;
    }
}