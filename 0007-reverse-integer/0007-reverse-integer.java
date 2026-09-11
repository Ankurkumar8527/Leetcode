class Solution {
    public int reverse(int x) {
        if(x==0)
        return x;
        int n = Math.abs(x);
        int ans = 0;
        while(n>0){
            int d = n%10;
            if(ans>Integer.MAX_VALUE/10) return 0;
            ans = ans*10+d;
            n/=10;
        }
        ans = x<0 ?  ans*(-1) : ans;
        return ans;
    }
}