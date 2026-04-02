class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] l=new int[n];int[] c=new int[n];
        Arrays.fill(l,1);Arrays.fill(c,1);
        int maxL=1;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                if(l[j]+1>l[i]){
                    l[i]=l[j]+1;
                    c[i]=c[j];
                }
                else if(1+l[j]==l[i]){
                    c[i]+=c[j];
                }
                }
                maxL=Math.max(maxL,l[i]); 
             
            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            if(l[i]==maxL)ans+=c[i];
        }
        return ans;
    }
}