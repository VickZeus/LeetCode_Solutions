class Solution {
    public void rotate(int[] nums, int k) {
        int[] x=new int[nums.length];

        for(int i=0;i<nums.length;i++)x[i]=nums[i];

        int n=nums.length;
        k=k%n;
        for(int i=nums.length-1;i>-1;i--){
            if(i-k>=0){
                nums[i]=x[i-k];
            }
            else{
                nums[i]=x[n+(i-k)];
            }
        }
    }
}