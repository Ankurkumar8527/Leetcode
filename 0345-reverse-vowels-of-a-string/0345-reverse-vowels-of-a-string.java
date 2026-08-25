class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ) return true;
        
        return false;
    }
    public void swap(char[] num,int i,int j){
        char t = num[i];
        num[i]=num[j];
        num[j]=t;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int i=0;
        int j=n-1;
        char[] num = s.toCharArray();
        while(i<j){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                swap(num,i,j);
                i++;
                j--;
            }
            else if(!isVowel(s.charAt(i))) i++;
            else j--;
        }
        String ans = "";
        for(char ch: num) ans+=ch;
        return ans;
    }
}