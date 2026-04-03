class Solution {
    Stack<String> stk;
    int a,b;
    HashSet<String> op=new HashSet<>();

    public int evalRPN(String[] tokens) {
        op.add("+");op.add("-");op.add("*");op.add("/");

        stk=new Stack<>();

        for(String s:tokens){
            if(stk.isEmpty()){ // if stack empty, just push
                stk.push(s);
            }
            else if(!op.contains(s)){ // if not symbols
                stk.push(s);
            }
            else{ // if symbol
                a=Integer.parseInt(stk.pop());
                b=Integer.parseInt(stk.pop());

                switch(s){
                    case "+" : stk.push(String.valueOf(a+b));break;
                    case "-" : stk.push(String.valueOf(b-a));break;
                    case "*" : stk.push(String.valueOf(a*b));break;
                    case "/" : stk.push(String.valueOf((int)b/a));break;
                    default : continue;
                }
            }
        }
        return Integer.parseInt(stk.peek());
    }
}