class Solution {
    public int GCD(int a,int b){
        if(a%b==0) return b;
        return GCD(b,b%a);
    }
    public int gcdOfOddEvenSums(int n) {
        if(n==1) return 1;
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        return GCD(sumOdd,sumEven);
    }
}