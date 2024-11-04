class Solution {
    public int romanToInt(String s) 
    {
        HashMap<Character,Integer> obj=new HashMap<>();
        obj.put('I',1);
        obj.put('V',5);
        obj.put('X',10);
        obj.put('L',50);
        obj.put('C',100);
        obj.put('D',500);
        obj.put('M',1000);
        char prev=s.charAt(0),curr;
        int n=obj.get(prev);
        for(int i=1;i<s.length();i++)
        {
            curr=s.charAt(i);
            if(obj.get(curr)>obj.get(prev))
            {
                n+=obj.get(curr)-2*obj.get(prev);
            }
            else 
            {
                n+=obj.get(curr);
            }
            prev=curr;
        }  
        return n;  
    }
}