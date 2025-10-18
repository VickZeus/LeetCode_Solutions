class Solution {
    public boolean check(int[] copy){
        int prev=-1,curr=-1;

        for(int i=0;i<copy.length;i++){
            if(copy[i]<0)continue;
            curr=copy[i];
            if(prev==-1){
                prev=copy[i];
            }
            else{
                if(curr<=prev)return false;
                prev=curr;
            }
        }
        return true;
    }

    public int incremovableSubarrayCount(int[] nums) {
        int[] copy;
        int count=0;
        for(int i=0;i<nums.length;i++){ //Brute Force approach since constraints are lame(& I am lazy)
            copy=nums.clone();
            for(int j=i;j<nums.length;j++){
                copy[j]=-1;
                if(check(copy))count++;
            }
        }
        return count;
    }
}