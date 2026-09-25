class Solution {
    public int sum(int x){
        if(x<=9) return x;
        int sum = 0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int digitSum = sum(nums[i]); 
            if(digitSum==i) return i;
        }
        return -1;
    }
}