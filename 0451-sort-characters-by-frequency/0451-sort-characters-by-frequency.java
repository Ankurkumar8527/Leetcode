class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        List<Character> a = new ArrayList<>(map.keySet());
        a.sort((x,y) -> map.get(y)-map.get(x));

        String ans = "";
        for(char ch : a){
            int freq = map.get(ch);
            while(freq-->0) ans+=ch;
        }
        return ans;
    }
}