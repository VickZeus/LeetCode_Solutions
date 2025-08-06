class Solution {
    public char[] stack;
    public int top;

    public void put(char ch){
        stack[++top]=ch;
    }

    public void pop(){
        --top;
    }

    public String stringify(){
        StringBuilder obj=new StringBuilder();
        for(int i=0;i<=top;i++){
            obj.append(stack[i]);
        }
        return obj.toString();
    }

    public String removeStars(String s) 
    {
        stack=new char[s.length()];
        top=-1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                pop();
            }
            else {
                put(s.charAt(i));
            }
        }
        return stringify();
    }
}