class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int j=n-1;
        while(j>=2){
            if(nums[j-2]+nums[j-1]>nums[j]){
                return nums[j-2]+nums[j-1]+nums[j];
            }j--;
        }
        return 0;
    }
}