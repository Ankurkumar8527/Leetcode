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
        HashSet<Integer> map = new HashSet<>();
        for(int val:nums){
            if(!map.contains(val)) map.add(val);
            int rev = reverse(val);
            if(!map.contains(rev)) map.add(rev);
        }
        return map.size();
    }
}