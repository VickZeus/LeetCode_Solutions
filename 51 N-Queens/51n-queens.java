class Solution {
    List <List<String>> ans;

    public List<String> result(char[][] dp){
        List<String> x=new ArrayList<>();
        String s;

        for(char[] ch:dp){
            s="";
            for(char c:ch)s+=(c=='\0')?'.':c;
            x.add(s);
        }
        return x;
    }

    public void compute(int n,int row,char[][] dp){
        if(row==n){
            ans.add(result(dp));
            return;
        }

        int trow,tcol;
        boolean flag;
        
        for(int col=0;col<n;col++){
            flag=false;

            trow=row;tcol=col;
            while(trow>-1 && !flag){
                if(dp[trow][tcol]=='Q')flag=true;
                trow--;
            }

            trow=row-1;tcol=col+1;
            while(trow>-1 && tcol<n && !flag){
                if(dp[trow][tcol]=='Q')flag=true;
                trow--;tcol++;
            }

            trow=row-1;tcol=col-1;
            while(trow>-1 && tcol>-1 && !flag){
                if(dp[trow][tcol]=='Q')flag=true;
                trow--;tcol--;
            }

            if(!flag){
                dp[row][col]='Q';
                compute(n,row+1,dp);
                dp[row][col]='\0';
            }
        }
        return;
    }

    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        char[][] dp;
        int row=0;

        for(int col=0;col<n;col++){
            dp=new char[n][n]; // build new dp for each iteration
            
            dp[0][col]='Q'; // set the queen at 0th row
            compute(n,row+1,dp);
        }
        
        return ans;
    }
}