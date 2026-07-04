class Solution {
    public int reverse(int val){
        int newVal=0;
        while(val>0){
            int d = val%10;
            val/=10;
            newVal=newVal*10+d;
        }
        return newVal;
    }
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            if(!map.containsKey(val)) map.put(val,1);
            int rev = reverse(val);
            if(!map.containsKey(rev)) map.put(rev,1);
        }
        return map.size();
    }
}