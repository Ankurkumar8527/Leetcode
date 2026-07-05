class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int val: arr){
            if(!map.containsKey(val)) map.put(val,1);
            else map.put(val,map.get(val)+1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int val : map.values()){
            if(!set.contains(val)) set.add(val);
            else return false;
        }
        return true;
    }
}