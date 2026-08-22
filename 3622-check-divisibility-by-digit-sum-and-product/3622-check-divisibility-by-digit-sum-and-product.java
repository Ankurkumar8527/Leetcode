class Solution {
    public void sumAndprod(int n,int[] arr){
        while(n>0){
            int mod = n%10;
            arr[0]+=mod;
            arr[1]*=mod;
            n/=10;
        }
    }
    public boolean checkDivisibility(int n) {
        int[] arr = new int[2];
        arr[0]=0;
        arr[1]=1;
        int x = n;
        sumAndprod(x,arr);
        return n%(arr[0]+arr[1])==0;
    }
}