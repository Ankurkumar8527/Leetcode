class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        int sum=0;
        int num =  n;
        int digit=1;
        while(num>0){
            int d = num%10;
            if(d!=0){
            x=x+digit*d;
            digit*=10;
            sum+=d;
            }
            num/=10;
           
        }
        return x*sum;
    }
}