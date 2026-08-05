class Solution {
    public int compute(int n,int[] dp,String s){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];

        int val=0;
        if(n-2>=0){
            int first=(s.charAt(n-2)-'0')*10;
            int second=s.charAt(n-1)-'0';
            int num=first+second;
            if(10<=num && num<=26)val=compute(n-2,dp,s);
        }

        int val2=0;
        if(s.charAt(n-1)!='0')val2=compute(n-1,dp,s);

        dp[n]=val2+val;
        return dp[n];

    }

    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];Arrays.fill(dp,-1);dp[0]=1;
        return compute(n,dp,s);
    }
}