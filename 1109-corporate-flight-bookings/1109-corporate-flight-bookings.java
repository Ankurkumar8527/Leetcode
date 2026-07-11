class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int i=0;i<bookings.length;i++){
            int fidx = bookings[i][0]-1;
            int sidx = bookings[i][1]-1;
            for(int j=fidx;j<=sidx;j++)
            {
                ans[j] = ans[j]+bookings[i][2];
            }
        }
        return ans;
    }
}