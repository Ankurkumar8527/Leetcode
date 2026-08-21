class Solution {
    public void swap(int[][] matrix,int i,int j) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i]=temp;
    }
    public void reverse(int[][] matrix,int row,int i,int j) {
        while(i<j){
            int t = matrix[row][i];
            matrix[row][i] = matrix[row][j];
            matrix[row][j] = t;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i){
                    swap(matrix,i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i,0,n-1);
        }
    }
}