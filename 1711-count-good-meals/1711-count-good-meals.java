class Solution {
    public int countPairs(int[] deliciousness) {
        int n = deliciousness.length;
        int mod = 1000000007;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val :deliciousness){
            int p = 1;
            for(int i=0;i<=21;i++){
                if(map.containsKey(p-val)){
                    count+=map.get(p-val);
                    count%=mod;
                }
                p*=2;
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return count;
    }
}