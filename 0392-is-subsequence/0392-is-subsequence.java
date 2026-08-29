class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s=="") return true;
        int m = t.length();
        int n = s.length();
        int i=0,j=0;
        while(i<n && j<m){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1==ch2) {
                i++;
                j++;
            }
            else j++;
        }
        return i==n;
    }
}