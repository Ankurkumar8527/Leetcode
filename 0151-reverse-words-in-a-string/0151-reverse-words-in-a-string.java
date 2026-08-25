class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int j = n-1;
        String ans = "";
        while(j>=0){
            int i=j;
            while(i>=0 && s.charAt(i)!=' ') i--;
            ans+=s.substring(i+1,j+1)+" ";
            while(i>=0 && s.charAt(i)==' ') i--;
            j=i;
        }
        int i=0;
        while(i<ans.length() && ans.charAt(i)==' ') i++;
        ans=ans.substring(i,ans.length());

        i=ans.length()-1;

        while(i>=0 && ans.charAt(i)==' ') i--;
        ans=ans.substring(0,i+1);
        return ans;
    }
}