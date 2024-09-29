class Solution {
    public int countSegments(String s) 
    {
        //System.out.println(Arrays.toString(s.split(" ")));
        if(s.equals(""))return 0;
        int count=0;
        for(String k:s.split(" "))
        {
            //System.out.println(k+"-"+count);
            if(!k.isEmpty())count++;
        }
        return count;    
        
    }
}