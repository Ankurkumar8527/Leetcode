class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n-1;i++){
            int val = (nums[i]-1)*(nums[i+1]-1);
            max = Math.max(max,val);
        }
        return max;
    }
}