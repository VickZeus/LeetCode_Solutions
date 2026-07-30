class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int[] arr=new int[26];
        char center=' ';

        if(n%2!=0)center=s.charAt(n/2);

        for(char ch:s.toCharArray())arr[ch-'a']+=1;
        StringBuilder obj=new StringBuilder();

        for(int i=0;i<26;i++){
            for(int j=0;j<arr[i]/2;j++)obj.append((char)(i+'a'));
        }

        String temp=obj.toString();
        String rev=obj.reverse().toString();
        String scenter=(center!=' ')?String.valueOf(center):"";
        return temp+scenter+rev;
    }
}