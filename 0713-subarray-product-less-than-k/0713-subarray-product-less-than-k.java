class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i=0,j=0,count=0;
        int prod = 1;

    // Sliding Window
        while(i<n && j<n){
           prod*=nums[j];
           while(prod>=k){
                prod/=nums[i++];
           }
           count+=j-i+1;
           j++;
        }
        
        return count;
    }
}