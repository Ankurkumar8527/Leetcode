class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==1 && nums[0]==k) return 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] lsum = new int[n];
        for(int i=n-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            lsum[i]=min;
        }
        for(int i=0;i<n;i++){
             max = Math.max(max,nums[i]);
            if(max-lsum[i]<=k) return i;
        }
        return -1;
    }
}