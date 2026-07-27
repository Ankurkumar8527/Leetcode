class Solution {
    public int maxProduct(int n) {
        String s = ""+n;
        int size = s.length();
        int[] arr = new int[size];
        int i=0;
        while(n>0){
            arr[i++]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[size-1]*arr[size-2];
    }
}