class Solution {

    public String compute(char[][] dp,String s,int n){
        int i=0,j=0;
        int zeroB=0;
        for(int k=0;k<s.length();k++){
            if(i+1<n && zeroB==0){
                dp[i][j]=s.charAt(k);
                i++;
            }
            else if(i+1==n){
                zeroB=1;
                dp[i--][j++]=s.charAt(k);
                if(i==0){
                    zeroB=0;continue;
                }
            }
            else{
                dp[i--][j++]=s.charAt(k);
                if(i==0){
                    zeroB=0;continue;
                }
            }
        }

        StringBuilder obj=new StringBuilder("");
        for(i=0;i<n;i++){
            for(j=0;j<dp[0].length;j++){
                if(dp[i][j]!='\u0000')obj.append(dp[i][j]);
            }
        }
        return obj.toString();
    }

    public String convert(String s, int numRows) {
        if(s.length()==1 || numRows==1 || (s.length()<=numRows))return s;
        int row=numRows,col=s.length();
        char[][] dp=new char[row][col];
        return compute(dp,s,numRows);
    }
}