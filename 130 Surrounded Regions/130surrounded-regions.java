class Solution {
    int row,col;

    public void compute(char[][] board,int i,int j){
        if(i<0 || i==row || j<0 || j==col || board[i][j]=='X' || board[i][j]=='#')return;

        if(board[i][j]=='O')board[i][j]='#';
        compute(board,i+1,j);
        compute(board,i-1,j);
        compute(board,i,j+1);
        compute(board,i,j-1);
    }

    public void solve(char[][] board) {
        row=board.length;col=board[0].length;

        for(int i=0;i<row;i++){
            if(board[i][0]=='O')compute(board,i,0);
            if(board[i][col-1]=='O')compute(board,i,col-1);
        }

        for(int i=0;i<col;i++){
            if(board[0][i]=='O')compute(board,0,i);
            if(board[row-1][i]=='O')compute(board,row-1,i);
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }
}