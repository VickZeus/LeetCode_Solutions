class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size(); //Number of rows
        int[] dp=new int[triangle.get(n-1).size()];

        for(int i=0;i<triangle.get(n-1).size();i++){
            dp[i]=triangle.get(n-1).get(i); //Initialise with last row values
        }

        for(int r=n-2;r>=0;r--){
            for(int c=0;c<triangle.get(r).size();c++){
                dp[c]=triangle.get(r).get(c)+Math.min(dp[c],dp[c+1]);
            }
        }

        return dp[0];
    }
}