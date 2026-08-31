class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int z = 0;
        for(int ele : nums) {
            if(ele==0) z++;
        }
        if(z==0) return n-1;
        int i = 0,j=0;
        int maxLen = 0;
        int noofzeroes = 0;

        
        while(i<n &&  nums[i]==0) i++;
        j=i;
        while(i<n && j<n){
            if(nums[j]==1) j++;
            else{
                if(noofzeroes==0){
                    j++;
                    noofzeroes++;
                }
                else{
                    int len = j-i-1;
                    maxLen = Math.max(maxLen,len);
                    j++;
                    while(i<n && nums[i]==1) i++;
                    i++;
                }
            }
        }
        if(noofzeroes==0) return j-i;
        maxLen = Math.max(maxLen,j-i-1);
        return maxLen;
    }
}