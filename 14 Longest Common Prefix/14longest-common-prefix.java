class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)return "";
        if(strs.length==1)return strs[0];
        String ss="";
        int sm=Integer.MAX_VALUE;
        
        for(String k:strs){
            if(k.length()<sm){
                ss=k;
                sm=k.length();
            }
        }
        if(ss.equals(""))return "";
        int c=0;
        boolean common=true;

        while(c<sm){
            for(String s:strs){
                if(ss.charAt(c)!=s.charAt(c))return ss.substring(0,c);
            }
            c++;
        }
        return ss;
    }
}