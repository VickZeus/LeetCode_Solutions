class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if(n==1)return (nums[0]==1)?2:1;

        for(int i=0;i<n;i++){
            if(nums[i]>n){
                nums[i]=-1;
            }
           
            while(nums[i]<=n && nums[i]>0 && nums[nums[i]-1]!=nums[i]){ 
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }   
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<n;i++)if(nums[i]!=i+1)return i+1;
        return n+1;
    }
}     