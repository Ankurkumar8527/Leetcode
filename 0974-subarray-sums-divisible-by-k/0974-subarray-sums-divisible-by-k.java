class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int[] freq = new int[k];
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];

        for(int i=0;i<n;i++){
            int x = ((nums[i]%k)+k)%k;
            if(x%k==0) count++;
            count+=freq[x];
            freq[x]++;   
        }
        return count;
    }
}