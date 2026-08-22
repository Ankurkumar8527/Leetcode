class Solution {
    public boolean checkVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int fc = 0;
        int sc = 0;
        for(int i=0;i<n/2;i++){
            if(checkVowel(s.charAt(i))) fc++;
            if(checkVowel(s.charAt(n-i-1))) sc++;
        }
        return fc==sc;
    }
}