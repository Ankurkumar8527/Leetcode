class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int i=0,j=0;
        while(j<n && sum<target) sum+=nums[j++];
        if(sum>=target) minLen=Math.min(minLen,j);
        j--;
        
        while(i<n && j<n){
            if(sum>=target) minLen=Math.min(minLen,j-i+1);
            sum=sum-nums[i++];
            j++;
            while(j<n && sum<target){
                sum+=nums[j++];
            } j--;
        }

        return (minLen==Integer.MAX_VALUE) ?  0 :  minLen;
    }
}