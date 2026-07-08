class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int m = n/2;
        int[][] arr = new int[m][2];
        Arrays.sort(skill);
        int i =0,j=n-1;
        int k=0;
        int prevSum=0;
        long ans =0;
        while(i<j){
            arr[k][0]=skill[i];
            arr[k][1]=skill[j];
            if(k>0){
                int val = arr[k][0]+arr[k][1];
                if(val!=prevSum) return -1;
            }
            prevSum = arr[k][0]+arr[k][1];
            ans += arr[k][0]*arr[k][1];
            k++;
            i++;
            j--;
        }
        return ans;
    }
}