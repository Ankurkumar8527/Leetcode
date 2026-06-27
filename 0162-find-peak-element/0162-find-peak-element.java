class Solution {
    public int findPeakElement(int[] nums) {
        int idx = 0;
        if(nums.length==1)
        return 0;
        for(int i=0;i<nums.length;i++){
            if(i==0 && nums[i]>Integer.MIN_VALUE && nums[i]>nums[i+1]) {
                idx=i;
                break;
            }
            if(i==nums.length-1 && nums[i]>nums[i-1] && nums[i]>Integer.MIN_VALUE){
                idx=i;
                break;
            }
            if(i>0 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                idx=i;
                break;
            }

        }
        return idx;
    }
}