class Solution {
    public int maximumLength(String s) 
    {
        int ans=0;
        HashMap<String,Integer> obj=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)!=s.charAt(j))break;
                String s2=s.substring(i,j+1);
                char ch=s2.charAt(0);

                if(obj.getOrDefault(s2,0)!=0)
                {
                    int k=obj.get(s2)+1;
                    obj.put(s2,k);
                }
                else
                {
                    obj.put(s2,1);
                }
                
            }
        }  
        int f=0;
        for(String h:obj.keySet())
        {
            System.out.println(h+"   "+obj.get(h));
            if(obj.get(h)>=3 && h.length()>ans)
            {
                ans=h.length();
                f=obj.get(h);
            }
        }
        return (ans==0)?-1:ans;  
    }
}