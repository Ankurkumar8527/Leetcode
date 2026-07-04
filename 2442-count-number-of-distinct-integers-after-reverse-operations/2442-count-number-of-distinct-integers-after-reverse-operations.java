class Solution {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
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