class Solution {
    public boolean isPalindrome(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else return false;
           }
           return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(n<=2) return true;
        int i=0,j=n-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else if(s.charAt(i)!=s.charAt(j))   return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
           }
        return true;
    }
}