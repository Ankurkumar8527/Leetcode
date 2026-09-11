class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long first = 9999;
        long second = 999;
        if(n<first && n>second) return n-999;
        long count = 0;
        for(long i=first;i<=n;i=(i*10+9)){
            String s = ""+i;
            int x = (s.length()-1)/3;
            count=count+(i-second)*x;
            second = i;
        }
        if(second<n){
            String s = ""+n;
            int x = (s.length()-1)/3;
            count=count+(n-second)*x;
        }
            return count;
    }
}