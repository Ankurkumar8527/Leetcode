class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<3) return false;
        int i=Integer.MAX_VALUE,j=Integer.MAX_VALUE;
        for(int idx=0;idx<n;idx++){
            if(nums[idx]<=i) i=nums[idx];
            else if(nums[idx]<=j) j=nums[idx];
            else return true;
        }
        return false;
    }
}