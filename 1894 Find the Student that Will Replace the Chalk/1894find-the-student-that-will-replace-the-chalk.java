class Solution {
    public int chalkReplacer(int[] chalk, int k) 
    {   
        if(chalk[0]>k)
            return 0;
        long sum=0;int i=0;
        while(true)
        {
            k=k-chalk[i];
            i++;
            if(i==chalk.length)
            {
                i=i-chalk.length;
            }
            if(k<chalk[i])
            {
                if(i>=chalk.length)
                {
                    i=i-chalk.length;
                }
                return i;
            }    
        }
    }
}