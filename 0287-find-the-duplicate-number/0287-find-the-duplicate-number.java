class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int findDuplicate(int[] a) {
        while(true){
           if(a[0]==a[a[0]]) return a[0];
           swap(a,0,a[0]);
        }
    }
}