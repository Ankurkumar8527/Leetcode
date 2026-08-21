class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int i=0,j=n-1;
        int a_score = 0;
        int b_score = 0;
        int k=0;
        while(i<j){
            if(k%2==0){
                if(piles[i]>=piles[j]){
                    a_score = piles[i];
                    i++;
                }
                else{
                    a_score = piles[j];
                    j--;
                }
            }
            else{
                     if(piles[i]>=piles[j]){
                    b_score = piles[i];
                    i++;
                }
                else{
                    b_score = piles[j];
                    j--;
                }
            }
            // k++;
        }
        return a_score>=b_score;
    }
}