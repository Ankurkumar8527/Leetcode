class Solution {
    public long sumAndMultiply(int num) {
        int x = 0;
        int sum=0;
        int digit=1;
        while(num>0){
            int d = num%10;
            if(d!=0){
            x+=digit*d;
            digit*=10;
            sum+=d;
            }
            num/=10;
           
        }
        return (long)x*sum;
    }
}