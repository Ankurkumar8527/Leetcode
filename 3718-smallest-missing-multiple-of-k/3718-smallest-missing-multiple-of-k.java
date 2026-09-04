class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        int i=1;
        while(true){
            int x = k*i;
            if(set.contains(x)) i++; 
            else {
                k=x;
                break;
            }
        }
        return k;
    }
}