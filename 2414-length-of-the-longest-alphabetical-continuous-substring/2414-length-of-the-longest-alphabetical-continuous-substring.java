class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        int i=0,j=1;
        int maxLen = 0;
        while(i<n && j<n){
            if(((s.charAt(j)-'a')-(s.charAt(j-1)-'a'))==1) j++;
            else{
                int len = j-i;
                maxLen = Math.max(len,maxLen);
                i=j;
                j++;
            }
        }
         maxLen = Math.max(j-i,maxLen);
         return maxLen;
    }
}