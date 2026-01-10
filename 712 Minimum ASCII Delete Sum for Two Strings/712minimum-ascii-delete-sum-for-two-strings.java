class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] LCS=new int[s1.length()+1][s2.length()+1];

        int totS1=0,totS2=0;
        for(int i=0;i<=s1.length();i++){
            LCS[i][0]=0; //Column=0
            if(i!=s1.length())totS1+=(int)s1.charAt(i);
        }
        for(int i=0;i<=s2.length();i++){
            LCS[0][i]=0; //Row=0
            if(i!=s2.length())totS2+=(int)s2.charAt(i);
        }

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    LCS[i][j]=LCS[i-1][j-1]+s1.charAt(i-1);
                }
                else{
                    LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1]);
                }
            }
        }

        return totS1+totS2-2*LCS[s1.length()][s2.length()] ;
    }
}