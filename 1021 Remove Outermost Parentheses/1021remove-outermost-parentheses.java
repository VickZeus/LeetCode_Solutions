class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        String ans="",temp="";

        for(char ch:s.toCharArray()){
            if(ch=='('){// first (
                temp=(stk.isEmpty())?"":temp+ch;
                stk.push(ch);
            }  
            else{
                if(stk.peek()=='(')stk.pop();
                if(stk.isEmpty()){
                    ans+=temp; // when last ) causes the stack to empty
                }
                else{
                    temp+=')';
                }
            }
        }
        return ans;
    }
}