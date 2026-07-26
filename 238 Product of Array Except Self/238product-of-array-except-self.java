class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,pro=1,pro2=1,cz=0;
        int[] ans=new int[n];

        for(int i:nums){
            if(i!=0)pro2*=i;
            pro*=i;
            if(i==0)cz++;
        }

        for(int i=0;i<n;i++){
            if(cz==0){
                ans[i]=pro/nums[i];
            }
            else if(cz==1){
                ans[i]=(nums[i]==0)?pro2:0;
            }
            else{
                ans[i]=0;
            }
        }
        return ans;
    }
}