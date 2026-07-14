class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];

        for(int i=0;i<n;i++){
            int x = ((nums[i]%k)+k)%k;
            if(x%k==0) count++;
            if(!map.containsKey(x)) map.put(x,1);
            else {
                count+=map.get(x);
                map.put(x,map.get(x)+1);
                }
        }
        return count;
    }
}