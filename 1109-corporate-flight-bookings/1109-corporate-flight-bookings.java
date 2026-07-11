class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int i=0;i<bookings.length;i++){
            int fidx = bookings[i][0]-1;
            int sidx = bookings[i][1];
            ans[fidx]+=bookings[i][2];
            if(sidx<n) ans[sidx]=ans[sidx]-bookings[i][2];
        }
        for(int i=1;i<n;i++) ans[i]+=ans[i-1];
        return ans;
    }
}