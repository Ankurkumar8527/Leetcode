class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
       int len = arr.length;
       if(n==0) return true;
       if(len==1) return arr[0]==0;
       int i=0;
        while(i<len){
            if(i==0){
               if(arr[i]==0 && arr[i+1]!=1) {
                n--;
                if(n==0) return true;
                arr[i]=1;
               }
            }
            else if(i==len-1){
                if(arr[i]==0 && arr[i-1]!=1){
                    n--;
                    if(n==0) return true;
                    arr[i]=1;
                }
            }
            else if(i>0 && i<len-1){
                if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0) {
                    n--;
                    if(n==0) return true;
                    arr[i]=1;
                }
            } i++;

        }
        
        return n==0;
    }
}