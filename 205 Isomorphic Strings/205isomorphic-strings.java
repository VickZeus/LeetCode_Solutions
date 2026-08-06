class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;

        HashMap<Character,Character> hm2=new HashMap<>();
        HashMap<Character,Character> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i),ch2=t.charAt(i);

            if(hm.containsKey(ch1) && hm.get(ch1)!=ch2)return false;
            if(hm2.containsKey(ch2) && hm2.get(ch2)!=ch1)return false;

            hm.put(ch1,ch2);
            hm2.put(ch2,ch1);
        }
        return true;
    }
}