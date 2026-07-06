class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            int key = ((val%k)+k)%k;
            if(!map.containsKey(key)) map.put(key,1);
            else  map.put(key,map.get(key)+1);
        }
        for(int key : map.keySet()){
            int val = k-key;
            val = ((val%k)+k)%k;
            if(!map.containsKey(val)) return false;
            int f1 = map.get(val);
            if(val==0 && f1%2!=0) return false;
            int f2 = map.get(key);
            if(f1!=f2) return false; 
        }
        return true;
    }
}