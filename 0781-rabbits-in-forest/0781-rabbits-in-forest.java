class Solution {
    public int numRabbits(int[] answers) {
        int n = answers.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : answers){
            if(!map.containsKey(ele+1)) map.put(ele+1,1);
            else map.put(ele+1,map.get(ele+1)+1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            int grp = map.get(key);
            ans+= (grp/key)*key;
            if(grp%key!=0) ans+=key;
        }
        return ans;
    }
}