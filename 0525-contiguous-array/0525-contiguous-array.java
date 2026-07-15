class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int idx=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<n;i++) 
        {
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(map.containsKey(sum)) idx=Math.max(idx,i-map.get(sum));
            else map.put(sum,i);

        }
        return idx;
        

    }
}