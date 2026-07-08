class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            int x = k-val;
            if(map.containsKey(x) && map.get(x)>0){
                max++;
                map.put(x,map.getOrDefault(x, 0) - 1);
            }
            else {
                map.put(val,map.getOrDefault(val, 0) + 1);
            }
        }

        return max;
    }
}