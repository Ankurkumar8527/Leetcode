class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=m-1;
        int j=0;
        while(i>=0 && j<n){
            if(target==matrix[i][j]) return true; 
            else if(target>matrix[i][j]) j++;
            else i--;
        }
        return false;
    }
}