class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secmax = -1;
        for(char ch : s.toCharArray()){
            int val = ch-'0';
            if(val>=0 && val<=9){
                if(val>max){
                    secmax = max;
                    max=val;
                }
                else if(val<max && val>secmax) secmax=val;
            }
        }
        return secmax;
    }
}