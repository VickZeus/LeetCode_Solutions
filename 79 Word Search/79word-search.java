class Solution {
    public int n,row,col;
    public boolean compute(char[][] board,String word,int i,int j,int k){
        if(i>=row || j>=col || i<0 || j<0)return false;
        if(board[i][j]!=word.charAt(k))return false;
        if(k==n-1){return true;}
        
        k++;
        char temp=board[i][j];

        board[i][j]='#';
        boolean up=compute(board,word,i-1,j,k);
        boolean down=compute(board,word,i+1,j,k);
        boolean right=compute(board,word,i,j+1,k);
        boolean left=compute(board,word,i,j-1,k);
        board[i][j]=temp;

        return up | down | left | right; 
    }

    public boolean exist(char[][] board, String word){ 
        n=word.length();row=board.length;col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean temp=compute(board,word,i,j,0);
                    if(temp)return true;
                }
            }
        }
        return false;
    }
}