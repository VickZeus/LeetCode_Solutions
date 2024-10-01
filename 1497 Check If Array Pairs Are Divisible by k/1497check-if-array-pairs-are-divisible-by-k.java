class Solution {
    public boolean canArrange(int[] arr, int k) 
    {
        int[] freq=new int[k];
        for(int i:arr)
        {
            int rem=i%k;
            if(rem<0)rem+=k;
            freq[rem]+=1;
        }    

        if(freq[0]%2!=0)return false;
        for(int i=1;i<=(k/2);i++)
        {
            if(freq[i]!=freq[k-i])return false;
        }
        return true;
    }
}