class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0,j=0;
        while(i<n && j<n){
            while(i<n && nums[i]!=0) i++;
            if(i<n && j<n && i<j && nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else j++;
        }

    }
}