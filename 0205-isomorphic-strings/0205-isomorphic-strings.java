class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        char[] freq = new char[128];
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(freq[(int)c1]=='\0') freq[(int)c1]=c2;
            if(freq[(int)c1]!=c2) return false;
        }
        char[] freq2 = new char[128];
        for(int i=0;i<n;i++){
            char c2 = s.charAt(i);
            char c1 = t.charAt(i);
            if(freq2[(int)c1]=='\0') freq2[(int)c1]=c2;
            if(freq2[(int)c1]!=c2) return false;
        }
        return true;
    }
}