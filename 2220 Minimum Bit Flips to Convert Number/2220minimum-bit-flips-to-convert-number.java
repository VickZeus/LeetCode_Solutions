class Solution {
    public int minBitFlips(int start, int goal) 
    {
        if(start==goal)return 0;
        int n=start^goal;
        int count=0;
        while(n>1)
        {
            int q=n/2; // quotient
            int r=n%2;
            if(r==1)count++;
            n=q;
        }
        return count+1;

    }
}