class Solution {
    public boolean isBalanced(String num) {
        int esum = 0;
        int osum = 0;
        for(int i=0;i<num.length();i++){
            int ele = num.charAt(i)-'0';
            if(i%2==0)  esum+=ele;
            else osum+=ele;
        }
        return esum==osum;
    }
}