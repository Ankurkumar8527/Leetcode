class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) nums[i]=nums[i]*nums[i];
        Arrays.sort(nums);
        int i=0,j=n-1;
        while(i<j){
            ans+=nums[j--];
            ans-=nums[i++]; 
        }
        if(i==j) ans+=nums[i];
        return ans;
    }
}