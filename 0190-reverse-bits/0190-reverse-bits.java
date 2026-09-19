class Solution {
    public int reverseBits(int n) {
        String bits = "";
        int x = n;
        while(x>0){
            int d = x%2;
            bits=d+bits;
            x/=2;
        }
        int len = 32-bits.length();
        while(len-->0)  bits="0"+bits;
        int ans = 0, p = 1;
        for(int i=0;i<32;i++){
            int ele = bits.charAt(i)-'0';
            ele = ele*p;
            p*=2;
            ans+=ele;
        }
        return ans;
    }
}