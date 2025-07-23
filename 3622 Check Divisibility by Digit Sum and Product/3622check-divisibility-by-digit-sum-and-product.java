class Solution 
{
    
    public boolean checkDivisibility(int n) 
    {
        int sum=0;
        int pro=1;
        int n2=n;
        while(n>0)
        {
            int i=n%10;
            n=n/10;
            sum+=i;
            pro*=i;
        }
        int k=n2%(sum+pro);
        return (k==0)?true:false;
    }
}