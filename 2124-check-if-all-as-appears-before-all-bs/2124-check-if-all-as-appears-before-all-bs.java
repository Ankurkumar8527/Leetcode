class Solution {
    public boolean checkString(String s) {
        int ac = 0;
        int bc = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b') bc++;
            else if(bc!=0 && s.charAt(i)=='a') return false;
        }
        return ac==0;
    }
}