class Solution {
    public int minimumRecolors(String s, int k) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int i=0,j=0,noofblacks=0,noofwhites=0;
        for(i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch=='W') noofwhites++;
            else noofblacks++;
        }
        if(noofblacks==k) return 0;
        minLen = Math.min(minLen,noofwhites);
        j=i;
        i=0;
        while(i<n && j<n){
            if(s.charAt(i)=='B' && s.charAt(j)=='W'){
                noofblacks--;
                noofwhites++;
            }
            if(s.charAt(i)=='W' && s.charAt(j)=='B'){
                noofblacks++;
                noofwhites--;
            }
            minLen = Math.min(minLen,noofwhites);
            i++;
            j++;
        }
         minLen = Math.min(minLen,noofwhites);
         return minLen;
    }
}