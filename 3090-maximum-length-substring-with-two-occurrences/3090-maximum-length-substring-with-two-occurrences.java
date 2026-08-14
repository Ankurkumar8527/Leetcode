class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int i=0,j=0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(i<n && j<n){
            char ch = s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq = map.get(ch);
                map.put(ch,freq+1);
                maxLen = Math.max(maxLen,j-i);
                if(map.get(ch)>2){
                    while(map.get(ch)>2){
                        char c = s.charAt(i);
                        int f = map.get(c);
                        if(f>=1) map.put(c,map.get(c)-1);
                        i++;
                    }
                }
            }
            j++;
        }
        maxLen = Math.max(maxLen,j-i);
        return maxLen;
    }
}