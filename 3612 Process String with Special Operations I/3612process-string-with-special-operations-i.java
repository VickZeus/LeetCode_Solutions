class Solution {
    public String processStr(String s) {
        StringBuilder obj=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(obj.length()>0)obj.deleteCharAt(obj.length()-1);
            }
            else if(ch=='#'){
                obj.append(obj.toString());
            }
            else if(ch=='%'){
                String temp=obj.reverse().toString();
                obj.setLength(0);
                obj.append(temp);
            }
            else{
                obj.append(ch);
            }
        }
        return obj.toString();
    }
}