class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stk.isEmpty() || ch=='('){
                stk.push(ch);
            }
            else{
                char x=(stk.peek()=='(')?stk.pop():stk.push(')');
            }
        }

        return stk.size();
    }
}