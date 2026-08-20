class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int count = 0;
        int sum = 0;
        for(int val : arr) sum+=val;
        if(sum%3!=0) return false;
        sum/=3;
        int temp = 0;
        for(int val : arr){
            temp+=val;
            if(temp==sum){
                count++;
                temp=0;
            }
        }
        return count>=3;
    }
}