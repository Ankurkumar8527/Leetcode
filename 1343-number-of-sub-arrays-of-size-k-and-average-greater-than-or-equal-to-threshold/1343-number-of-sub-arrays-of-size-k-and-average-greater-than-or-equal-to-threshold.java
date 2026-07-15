class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int i=0,j=k-1;
        int sum = 0;
        for(int x=0; x<=j;x++){
            sum+=arr[x];
        }
        if((sum/k)>=threshold) count++;
        i++;j++;
        while(j<n){
            sum=sum-arr[i-1]+arr[j];
            if((sum/k)>=threshold) count++;

            i++;j++;
        }
        return count;
    }
}