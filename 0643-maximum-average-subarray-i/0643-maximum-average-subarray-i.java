class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i=0,j=0;
        double sum = 0;
        double avg = Integer.MIN_VALUE;
        while(i<k) sum+=nums[i++];
        avg = Math.max(avg,sum/k);
        j=i;
        i=0;
        while(j<n){
            sum = sum-nums[i]+nums[j];
            avg = Math.max(avg,sum/k);
            i++;j++;
        }
        avg = Math.max(avg,sum/k);
        return avg;
    }
}