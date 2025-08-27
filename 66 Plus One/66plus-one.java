class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] ans=new int[n];

        int carry=1;
        for(int i=n-1;i>-1;i--){
            if(carry==1 && digits[i]==9){
                carry=1;
                ans[i]=0;
            }
            else if(carry==1 && digits[i]<9){
                carry=0;
                ans[i]=digits[i]+1;
            }
            else{
                ans[i]=digits[i];
            }
        }

        if(carry==1){
            int[] ans2=new int[n+1];
            ans2[0]=1;
            for(int i=1;i<n+1;i++){
                ans2[i]=ans[i-1];
            }
            return ans2;
        }
        return ans;
    }
}