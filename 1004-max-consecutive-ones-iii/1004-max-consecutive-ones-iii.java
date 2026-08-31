class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int z = 0;
        for(int ele :  nums){
            if(ele==0) z++;
        } if(z==0) return n;
        if(k==0) {
            int ones = 0,ans=0;
            for(int ele : nums){
                if(ele==1) ones++;
                else {
                    ans = Math.max(ans,ones);
                    ones=0;
                }
            }
            ans = Math.max(ans,ones);
            return ans;
        }
        int i=0,j=0,maxlen=0,zeroes=0;

        while(i<n && j<n){
            if(nums[j]==1) j++;
            else{
                if(zeroes<k){
                    j++;
                    zeroes++;
                }
                else{
                    int len = j-i;
                    maxlen=Math.max(maxlen,len);
                    j++;
                    while(i<n && nums[i]==1) i++;
                    i++;
                }
            }
        }
        if(zeroes==0) return j-i;
        maxlen = Math.max(maxlen,j-i);
        return maxlen;
    }
}