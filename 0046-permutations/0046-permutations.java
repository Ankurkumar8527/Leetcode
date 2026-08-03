class Solution {
    public void permutations(int i,int n,int[] nums,List<Integer> path,List<List<Integer>> ans){
        if(path.size()==n){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int j=0;j<n;j++){
            if(!path.contains(nums[j])){
                path.add(nums[j]);
                permutations(j+1,n,nums,path,ans);
                path.remove(path.size()-1);
            }
    
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0,n,nums,new ArrayList<>(),ans);
        return ans;
    }
}