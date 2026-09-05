class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long p = 1;
        long LIMIT = 100_000_000_000_000L;
        long[] preffix = new long[n];
        for(int i=1;i<n;i++)    preffix[i]=preffix[i-1]+nums[i-1];
        for(int i=n-1;i>=0;i--){
                if(preffix[i]==p) return i;
                if(i>0){
                    if(p> LIMIT/nums[i]) p=LIMIT+1;
                    else    p*=nums[i];
                }
                
        }
        return -1;
    }
}