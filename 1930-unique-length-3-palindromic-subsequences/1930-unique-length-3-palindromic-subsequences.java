class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            else smap.put(ch,i); 
        }
        int count = 0;
        for(char key : fmap.keySet()){
            if(smap.containsKey(key)){
                int fidx = fmap.get(key);
                int sidx = smap.get(key);
                boolean[] set = new boolean[26];
                for(int i=fidx+1;i<sidx;i++){
                    int ch = s.charAt(i)-'a';
                    if(set[ch]==true) continue;
                    set[ch]=true;
                    count++;
                }
            }
        }
        return count;
    }
}