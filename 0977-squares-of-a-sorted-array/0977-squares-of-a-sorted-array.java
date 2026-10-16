class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i=0,j=n-1;
        int k = n-1;
        while(i<=j){
            int x = nums[i]*nums[i];
            int y =  nums[j]*nums[j];
            if(x>y){
                ans[k]=x;
                i++;
            }
            else{
                ans[k]=y;
                j--;
            }
            k--;
        }
        return ans;
    }
}