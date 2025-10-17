class Solution {
    public void solve(char[][] board) {
        int nr= board.length;
        int nc= board[0].length;

         for(int j=0;j<nc;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j);
            }
            if(board[nr-1][j]=='O'){
                dfs(board,nr-1,j);
            }
         }   
        
          
         for(int i=0;i<nr;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][nc-1]=='O'){
                dfs(board,i,nc-1);

            }
         
         
         }
         for(int row =0;row<nr;row++){
            for(int col=0;col<nc;col++){
                if(board[row][col]=='V'){
                 board[row][col]='O';
                      }
                  else if(board[row][col]=='O'){
                    board[row][col]='X';
               }
            }
         }

    }
    public void dfs(char[][]board,int row,int col){
        if(row<0 || col<0|| row>=board.length|| col>=board[0].length || board[row][col] !='O'){
            return;
        }
          board[row][col]='V';
          dfs(board, row, col-1);
          dfs(board, row, col+1);
          dfs(board, row-1, col);
          dfs(board, row+1, col);
    }
}