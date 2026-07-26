class Solution {
    
    HashMap<String,List<String>> map;

    public void match(String s){
        String st=numero(s);
        List<String> temp=map.getOrDefault(st,new ArrayList<>());
        temp.add(s);
        map.put(st,temp);
    }

    public String numero(String s){
        int[] freq=new int[26];
        String n="";

        for(int i=0;i<s.length();i++){ // length string s
            freq[s.charAt(i)-'a']+=1;
        } 

        for(int i=0;i<26;i++){
            if(freq[i]!=0)n+=String.valueOf(i)+"*"+String.valueOf(freq[i])+".";
        }
        return n;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        map=new HashMap<>();

        for(String k:strs){match(k);} // O(n)
        for(String key:map.keySet())ans.add(map.get(key));
        return ans;
    }
}