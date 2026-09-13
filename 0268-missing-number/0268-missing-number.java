class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(i==n || nums[i]==n || nums[i]==i) i++;
            else swap(nums,i,nums[i]);
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j) return j;
        }
        return n;
    }
}