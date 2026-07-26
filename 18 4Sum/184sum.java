class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length,a,b,c,d;
        long sum=0;

        List<List<Integer>> ans=new ArrayList<>();
        Integer[] arr=new Integer[4];

        Arrays.sort(nums);

        for(a=0;a<n-3;a++){
            for(b=a+1;b<n-2;b++){
                c=b+1;
                d=n-1;

                while(c<d){
                    sum=(long)nums[a]+nums[b]+nums[c]+nums[d];
                    arr[0]=nums[a];
                    arr[1]=nums[b];
                    arr[2]=nums[c];
                    arr[3]=nums[d];

                    if(sum==target){
                        List<Integer> temp=List.of(arr);
                        if(!ans.contains(temp))ans.add(temp);
                    }

                    if(sum<target){
                        c++;
                    }
                    else{
                        d--;
                    }
                }
            }
        }
        return ans;
    }
}