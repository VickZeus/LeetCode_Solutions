class Solution {

    public boolean checker(int n){
        boolean flag=false;
        int prev=0,curr;

        while(n>0){
            curr=n%2;
            if(curr==1 && prev==1 && !flag){
                flag=true;
            }
            else if(curr==1 && prev==1 && flag){
                return false;
            }
            
            n=n/2;
            prev=curr;
        }

        if(flag)return true;
        return false;
    }
    
    public boolean consecutiveSetBits(int n) {
        if(checker(n))return true;
        return  false;
    }
}