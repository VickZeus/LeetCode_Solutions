class Solution {
    public String mergeCharacters(String s, int k) {
        HashMap<Character,Integer> index=new HashMap<>();
        StringBuilder obj=new StringBuilder("");
        int diff=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int pos=index.getOrDefault(ch,-1);
            
            if(pos==-1){
                index.put(ch,i-diff);
                obj.append(ch);
            }
            else{
                if((i-diff)-pos>k){
                    index.put(ch,i-diff);
                    obj.append(ch);
                }
                else{
                    diff++;
                }
            }
        }
        return obj.toString();
    }
}