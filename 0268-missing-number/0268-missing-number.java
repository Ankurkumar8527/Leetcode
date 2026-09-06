class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] ans = new boolean[n+1];
        for(int i=0;i<n;i++){
            ans[nums[i]]=true;
        }
        int c = -1;
        for(int i=0;i<n+1;i++){
            if(!ans[i]) c=i;
        }
        return  c; 
    }
}