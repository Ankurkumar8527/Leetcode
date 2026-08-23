class Solution {
    public boolean areNumbersAscending(String s) {
        int x = -1;
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            int val = ch-'0';
            int j = i+1;
            if(val>=0 && val<=9){
                while(j<s.length() && s.charAt(j)!=' '){
                    val = val*10+(s.charAt(j)-'0');
                    j++;
                }
                if(val<=x) return false;
                x=val;
            }
            i=j;
        }
        return true;
    }
}