class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i=0,j=0;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        while(i<k)  sum+=nums[i++];
        max = Math.max(max,sum/k);
        j=i;
        i=0;
        while(j<n){
            sum=sum-nums[i]+nums[j];
            max = Math.max(max,sum/k);
            i++;
            j++;
        }
        return max;
    }
}