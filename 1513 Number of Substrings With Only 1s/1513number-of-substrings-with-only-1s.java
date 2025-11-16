class Solution {
    public int numSub(String s) {
        int n=s.length();
        final int MOD = 1000000007;
        long totCount=0;
        long local=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                local++;
            }
            else{
                totCount+=(local*(local+1))/2;
                local=0;
                totCount%=MOD;
            }
        }
        totCount=totCount+((local*(local+1))/2)%MOD;
        return (int)totCount;
    }
}