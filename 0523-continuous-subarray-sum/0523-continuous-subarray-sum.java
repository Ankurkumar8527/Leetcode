class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<n;i++){
            int rem = nums[i]%k;
            if(!map.containsKey(rem)) map.put(rem,i);
            else {
                if(i-map.get(rem)>=2) return true;
                map.put(rem,Math.min(i,map.get(rem)));
            }
        }
        return false;
    }
}