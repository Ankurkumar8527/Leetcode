class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int x = nums[i]-1;
            if(x==i) i++;
            else if(x==nums[x]-1) return x+1;
            else swap(nums,x,i);    
        }
        return n;
    }
}