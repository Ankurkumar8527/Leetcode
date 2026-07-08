class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int left = 0;
        int right = n-1;
        
        Arrays.sort(nums);
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==k) {
                max++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;
            }
            else right--;
        }
        return max;
    }
}