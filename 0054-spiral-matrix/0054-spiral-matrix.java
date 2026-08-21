class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0;
        int maxr = m-1;
        int minc = 0;
        int maxc = n-1;
        List<Integer> ans = new ArrayList<>();
        while(minr<=maxr && minc<=maxc){
            for(int i=minc;i<=maxc;i++) ans.add(matrix[minr][i]);
            minr++;
            if(minr>maxr) break;
            for(int i=minr;i<=maxr;i++) ans.add(matrix[i][maxc]);
            maxc--;
            if(minc>maxc) break;
            for(int i=maxc;i>=minc;i--) ans.add(matrix[maxr][i]);
            maxr--;
            if(minr>maxr ) break;
            for(int i=maxr;i>=minr;i--)ans.add(matrix[i][minc]);
            minc++;
            if(minc>maxc) break;
        }
        return ans;
    }
}