class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<n){
            int x = nums[i]-1;
            if(x==nums[x]-1 || x==i) i++; 
            else swap(nums,x,i);
        } 
        for(int j=0;j<n;j++){
            if(j!=nums[j]-1) ans.add(j+1);
        }
        return ans;
    }
}