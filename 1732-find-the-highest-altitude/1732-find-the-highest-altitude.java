class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n+1];
        alt[0]=0;
        for(int i=0;i<n;i++)
        {
            alt[i+1]=alt[i]+gain[i];
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++)
        {
            ans = Math.max(ans,alt[i]);
        }
        return ans;
    }
}