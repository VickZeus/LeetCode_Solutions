class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character,Integer> obj=new HashMap<>();
        for(char ch:ransomNote.toCharArray()) // Adding all chars of ransomNote to HM
        {
            obj.put(ch,obj.getOrDefault(ch,0)+1);
        }

        for(char ch:magazine.toCharArray()) //Removing all the char and their frequencies
        {
            if(obj.getOrDefault(ch,0)==0)continue;
            obj.put(ch,obj.get(ch)-1);
        }

        for(char ch:obj.keySet())
        {
            if(obj.get(ch)>0)return false;
        }
        return true;
    }
}