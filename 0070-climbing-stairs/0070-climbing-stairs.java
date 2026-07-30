class Solution {
    public int climbStairs(int n) {
        // Space Optimization 
        if(n<=3) return n;
        int a = 2,b = 3;
        for(int i=3;i<n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}