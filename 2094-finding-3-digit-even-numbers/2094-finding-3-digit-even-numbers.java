class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int val : digits){
            if(!map.containsKey(val)) map.put(val,1);
            else map.put(val,map.get(val)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=100;i<=999;i++){
            int num = i;
            int x = num%10;
            num/=10;
            if(x%2==0 && map.containsKey(x) && map.get(x)!=0){
                map.put(x,map.get(x)-1);
                int y = num%10;
                num/=10;
                if(map.containsKey(y) && map.get(y)!=0){
                    map.put(y,map.get(y)-1);
                    if(map.containsKey(num) && map.get(num)!=0)
                    {
                        // map.put(num,map.get(num)-1);
                        set.add(i);
                    }
                    map.put(y,map.get(y)+1);
                }
                map.put(x,map.get(x)+1);
            }
        }
        int[] ans = new int[set.size()];
        int j=0;
        for(int val : set){
            ans[j++]=val;
        }
        Arrays.sort(ans);
        return ans;
    }
}