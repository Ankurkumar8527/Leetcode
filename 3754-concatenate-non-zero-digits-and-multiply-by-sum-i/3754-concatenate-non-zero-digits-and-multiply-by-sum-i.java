class Solution {
    public long sumAndMultiply(int num) {
        int x = 0;
        int sum=0;
        int digit=1;
        while(num>0){
            int d = num%10;
            num/=10;
            if(d==0) continue;
            x+=digit*d;
            digit*=10;
            sum+=d;
        }
        return (long)x*sum;
    }
}