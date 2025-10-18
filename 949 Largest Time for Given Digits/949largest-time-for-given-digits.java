class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int sum=0;
        for(int i:arr)sum+=i;

        int maxD=Integer.MAX_VALUE;
        int total=24*60;
        int h1=-1,h0=-1,m1=-1,m0=-1;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j)continue;
                for(int k=0;k<4;k++){
                    if(i==k || j==k )continue;
                    int rem=sum-arr[i]-arr[j]-arr[k];
                    int gen=60*(10*arr[i]+arr[j])+10*arr[k]+rem;
                    
                    if(10*arr[i]+arr[j]>=24 || 10*arr[k]+rem>=60)continue;
                    if(total-gen<maxD){
                        h1=arr[i];
                        h0=arr[j];
                        m1=arr[k];
                        m0=rem;
                        maxD=total-gen;
                    }
                }
            }
        }

        if(h1==-1 || h0==-1 || m1==-1 || m0==-1)return "";
        String s=String.valueOf(h1)+String.valueOf(h0)+":"+String.valueOf(m1)+String.valueOf(m0);
        return s;
    }
}