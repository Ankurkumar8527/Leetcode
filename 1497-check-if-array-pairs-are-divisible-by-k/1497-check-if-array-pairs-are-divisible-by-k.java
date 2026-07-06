class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] map = new int[k];
        for(int i=0;i<n;i++){
            int val = ((arr[i]%k)+k)%k;
            map[val]++;
        }
        if(map[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++){
            int rem = k-i;
            if(map[rem]!=map[i]) return false;
        }
        return true;
    }
}