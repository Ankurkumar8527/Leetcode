class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int x = nums[i];
            if(x>n || x==i+1 || x<=0 || x==nums[x-1]) i++;
            else swap(nums,x-1,i);
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
              return j+1;
            }
        }
        return n+1;
    }
}