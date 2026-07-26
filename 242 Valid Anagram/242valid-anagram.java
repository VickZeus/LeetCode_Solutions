class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        int[] freq=new int[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']+=1;
            freq[t.charAt(i)-'a']-=1;
        }

        for(int k:freq){
            if(k!=0)return false;
        }
        return true;
    }
}