class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            if(freq[ch-'a']==2) return ch;
        }
        return 'a';
    }
}