class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                min++;max++;
            }
            else if(ch==')'){
                min=(min-1<0)?min:min-1;
                max=max-1;
            }
            else if(ch=='*'){
                min=(min-1<0)?min:min-1;
                max=max+1;
            }
            if(max<0)return false;
        }
        return min==0;
    }
}