class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==1 && nums[0]==k) return 0;
        int max = 0;
        // int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++) min = Math.min(min,nums[j]);

            int diff = max-min;
            if(diff<=k) return i;
        }
        return -1;
    }
}