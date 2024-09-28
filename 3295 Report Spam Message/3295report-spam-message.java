class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) 
    {
        HashSet<String> k=new HashSet<>();

        for(String x1:bannedWords)
        {
            k.add(x1);
        }

        int count=0;
        for(String x:message)
        {
            if(k.contains(x))count++;
            if(count==2)return true;
        }    
        return false;
    }
}