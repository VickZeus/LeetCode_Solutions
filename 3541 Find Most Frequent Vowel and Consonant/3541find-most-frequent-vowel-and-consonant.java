class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int maxC=0,maxV=0;

        for(char ch:s.toCharArray()){
            freq[ch-'a']+=1;
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                maxV=Math.max(freq[ch-'a'],maxV);
            }
            else{
                maxC=Math.max(freq[ch-'a'],maxC);
            }
        }
        return maxC+maxV;
    }
}