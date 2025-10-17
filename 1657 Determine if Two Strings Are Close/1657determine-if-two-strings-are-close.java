class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();

        for(int i=0;i<word1.length();i++){ //Frequency map
            h1.put(word1.charAt(i),h1.getOrDefault(word1.charAt(i),0)+1);
            h2.put(word2.charAt(i),h2.getOrDefault(word2.charAt(i),0)+1);
        }

        List<Integer> h2v=new ArrayList<>();

        for(char ch:h2.keySet())h2v.add(h2.get(ch));

        for(char ch:h1.keySet()){
            if(!h2.keySet().contains(ch))return false;
        }

        for(int v:h1.values()){
            if(!h2v.contains(v))return false;
            h2v.remove(Integer.valueOf(v));
        }
        return true;
    }
}