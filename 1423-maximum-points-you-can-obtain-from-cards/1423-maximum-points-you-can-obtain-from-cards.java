class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int i=0,j=0,maxScore=0,TotalSum=0;
        for( i=0;i<n;i++){
           TotalSum+=cardPoints[i];
        }
        i=0;
        int sum=0;
        for( i=0;i<n-k;i++){
            sum+=cardPoints[i];
        }
        maxScore=Math.max(maxScore,TotalSum-sum);
        j=i;
        i=0;
        while(i<n && j<n){
            sum=sum-cardPoints[i]+cardPoints[j];
            i++;
            j++;
            maxScore=Math.max(maxScore,TotalSum-sum);
        }
        maxScore=Math.max(maxScore,TotalSum-sum);
         return maxScore;
    }
}