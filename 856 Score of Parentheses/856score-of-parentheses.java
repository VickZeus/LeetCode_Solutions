class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(ch!=')'){
                stk.push(ch);
            }
            else{
                int temp=0;
                while(stk.peek()!='('){
                    if(stk.peek()!=')')temp+=stk.pop()-'0';
                }
                stk.pop();
                stk.push((temp==0)?'1':(char)(temp*2+'0'));
            }
        }

        int sum=0;
        while(!stk.isEmpty())sum+=stk.pop()-'0';
        return sum;
    }
}