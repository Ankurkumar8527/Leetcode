class Solution {
    public int[] twoSum(int[] nums, int k) {
        int[] arr = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int fn = k-nums[i];
            if(map.containsKey(fn)){
                int idx =map.get(fn);
                arr[0]=idx;
                arr[1]=i;
                return arr;
            }
            else {
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}