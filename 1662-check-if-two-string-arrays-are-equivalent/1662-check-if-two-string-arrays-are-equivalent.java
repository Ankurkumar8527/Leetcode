class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(String s : word1) s1+=s;
        for(String s : word2) s2+=s;
        if(s1.length()!=s2.length()) return false;
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
            i++;
        }
        return true;
    }
}