class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==k)  count++;
            if(map.containsKey(nums[i]-k))  count+=map.get(nums[i]-k);
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
            
        }
        return count;
    }
}