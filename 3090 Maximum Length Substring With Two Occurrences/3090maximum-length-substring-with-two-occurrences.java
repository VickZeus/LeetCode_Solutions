class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,n=s.length(),longest=0;
        
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            while(hm.get(ch)>2){
                char left=s.charAt(i);
                hm.put(left,hm.getOrDefault(left,0)-1);
                i++;
            }
            longest=Math.max(longest,j-i+1);
        }
        return longest;
    }
}