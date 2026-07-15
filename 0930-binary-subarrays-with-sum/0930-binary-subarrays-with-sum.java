class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int count = 0;
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==goal) count++;
            if(map.containsKey(nums[i]-goal)) count+=map.get(nums[i]-goal);
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        return count;
    }
}