class Solution {
    public boolean checkGoodInteger(int n) {
        int ss = 0;
        int ds = 0;
        while(n>0){
            int rem = n%10;
            ss+=rem*rem;
            ds+=rem;
            n/=10;
        } 
        return ss-ds>=50;
    }
}