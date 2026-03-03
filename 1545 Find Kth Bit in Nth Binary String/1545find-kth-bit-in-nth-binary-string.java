class Solution 
{

    public String inverse(String s)
    {
        StringBuilder obj=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch=='1')obj.append('0');
            if(ch!='1')obj.append('1');
        }
        return obj.reverse().toString();
    }
    public char findKthBit(int n, int k) 
    {
        String s0="0";
        String sn=s0;
        for(int i=1;i<n;i++)
        {
            sn=sn+"1"+inverse(sn);
        }
        //System.out.println(sn);
        return sn.charAt(k-1);

    }
}