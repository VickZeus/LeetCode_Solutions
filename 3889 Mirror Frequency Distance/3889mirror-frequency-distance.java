class Solution {
    public int mirrorFrequency(String s) {
        if(s.length()==0)return 0;
        if(s.length()==1)return 1;
        HashMap<Character,Integer> hm=new HashMap<>();
        int sum=0;
        
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        char mirr;
        HashSet<Character> done=new HashSet<>();
        for(char key:hm.keySet()){
            if(done.contains(key))continue;
            if(Character.isLetter(key)){
                mirr=(char)('z'-(key-'a'));                
            }
            else{
               mirr=(char)('9'-(key-'0'));
            }
            sum+=Math.abs(hm.getOrDefault(mirr,0)-hm.get(key));
            done.add(mirr);
        }
        return sum;
    }
}