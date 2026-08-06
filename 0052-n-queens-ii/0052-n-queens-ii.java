class Solution {

    public boolean isSafe(int row,int col,int n,List<List<String>> board){
        int demorow=row;
        int democol=col;

        while(row>=0 && col>=0){
            if(board.get(row).get(col).equals("Q")) return false;
            row--;
            col--;
        }
        row=demorow;
        col=democol;
        while(col>=0){
            if(board.get(row).get(col).equals("Q")) return false;
            col--;
        }
        row=demorow;
        col=democol;
        while(row<n && col>=0){
            if(board.get(row).get(col).equals("Q")) return false;
            row++;
            col--;
        }
        return true;
    }
    public void placingQueens(int col,int n,List<List<String>> board,List<List<String>> ans){
        if (col == n) {
            List<String> temp = new ArrayList<>();

            for (List<String> row : board) {
                temp.add(String.join("", row));
            }

            ans.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,n,board)){
                board.get(row).set(col, "Q");
                placingQueens(col+1,n,board,ans);
                board.get(row).set(col, ".");
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        List<List<String>> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }
        placingQueens(0,n,board,ans);
        return ans.size();
    }
}