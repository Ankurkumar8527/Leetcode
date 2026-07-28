class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        int lastd = (int)Math.pow(10,n);
        for(int i=lastd-1;i>=1;i--){
            int x = i;
            int sum = 0;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            if(sum==s) return i;
        }
        return -1;
    }
}