class Solution 
{
    public String reverseWords(String s) 
    {
        StringBuilder k=new StringBuilder("");
        String[] arr=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].equals("")==false)
            {
                //System.out.println(arr[i]);
                k.append(arr[i].trim()+" ");
            }   
        }
        return k.toString().trim();
    }
}