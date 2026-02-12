class Solution {
    public int check(int[] freq){
        int temp=-1;
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if(temp==-1){
                    temp=freq[i];
                }
                else if(freq[i]!=temp){
                    return 0;
                }
                count+=freq[i];
            }
        }
        return count;
    }

    public int longestBalanced(String s) {
        int maxLen=1;
        if(s.length()==0)return 0;
        for(int i=0;i<s.length()-1;i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']+=1;
                maxLen=Math.max(maxLen,check(freq));
            }
        }
        return maxLen;
    }
}