class Solution {
    public int maxNumberOfBalloons(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(char ch :s.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        }
        int ans = Integer.MAX_VALUE;

        for(char key :map.keySet()){
        if(key=='l' &&  map.get(key)%2!=0 || key=='o' &&  map.get(key)%2!=0)
            ans = Math.min((map.get(key)-1)/2,ans);
        else if(key=='l' && map.get(key)%2==0 || key=='o' && map.get(key)%2==0)
            ans = Math.min((map.get(key))/2,ans);
        else ans =  Math.min(map.get(key),ans);
        }
        return ans;
    }
}