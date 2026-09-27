class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        int n=s.length();
        s="("+s+")";

        for(char ch:s.toCharArray()){
            if(ch!=')'){
                stk.push(ch);}
            else{
                StringBuilder x=new StringBuilder();
                while(!stk.isEmpty() && stk.peek()!='('){x.append(stk.pop());}
                stk.pop();
                if(stk.isEmpty())return x.reverse().toString();
                for(char ch2:x.toString().toCharArray())stk.push(ch2);
            }
        }
        return " ";
    }
}