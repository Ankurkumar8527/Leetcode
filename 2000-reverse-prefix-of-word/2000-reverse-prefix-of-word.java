class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int idx = 0;
        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            if(ch==c) {
                idx=i;
                break;
            }
        }
        StringBuilder ans = new StringBuilder(word.substring(0,idx+1));
        ans = ans.reverse();
        return ans+word.substring(idx+1,n);
    }
}