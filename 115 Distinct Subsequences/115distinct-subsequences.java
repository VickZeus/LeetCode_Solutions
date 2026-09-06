class Solution {
    String s,t;
    int n1,n2;
    int[][] dp;

    public int compute(int i,int j){
        if(j==n2)return 1;// if second string is formed
        if(i==n1)return 0;
        if(dp[i][j]!=-1)return dp[i][j];

        dp[i][j]=compute(i+1,j); // fixes -1 to 0
        if(s.charAt(i)==t.charAt(j))dp[i][j]+=compute(i+1,j+1);

        return dp[i][j];
    }
    public int numDistinct(String s, String t) {
        this.s=s;this.t=t;n1=s.length();n2=t.length();

        dp=new int[n1+1][n2+1];
        for(int[]k :dp)Arrays.fill(k,-1);

        return compute(0,0);
    }
}