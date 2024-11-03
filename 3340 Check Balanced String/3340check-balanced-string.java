class Solution {
    public boolean isBalanced(String num) 
    {
        int es=0,os=0;
        for(int i=0;i<num.length();i++)
        {
                 if(i%2==0)es+=Character.getNumericValue(num.charAt(i));
                 if(i%2!=0)os+=Character.getNumericValue(num.charAt(i));
        }
        if(es==os)return true;
        return false;
    }
}