class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int i = 0;
        while(i<n){
            if(nums[i]==i+1 || nums[i]==nums[nums[i]-1] ) i++;
            else swap(nums,i,nums[i]-1);
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
                return ans;
            }
        }
        return ans;
    }
}