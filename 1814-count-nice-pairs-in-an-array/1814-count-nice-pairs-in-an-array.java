class Solution {
    public int reverse(int n){
        int rev = 0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int MOD = 1000000007;
        for(int val:nums){
            val = val-reverse(val);
                if(!map.containsKey(val)) map.put(val,1);
                else{
                    int freq = map.get(val);
                    count+=freq;
                    count%=MOD;
                    map.put(val,freq+1);
                }
        }
        return count;
    }
}