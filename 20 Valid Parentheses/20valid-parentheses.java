class Solution 
{
    public char[] stack;
    public int top;

    public void pop()
    {
        --top;
    }

    public void push(char n)
    {
        stack[++top]=n;
    }


    public boolean isValid(String s) 
    {        
        top=-1;
        stack=new char[s.length()];
        for(char i:s.toCharArray())
        {
            if(top==-1)
            {
                push(i);
                continue;
            }
            if((i=='}' && stack[top]=='{')||(i==')' && stack[top]=='(')||(i==']' && stack[top]=='['))
            {
                pop();
            }
            else 
            {
                push(i);
            }
        }
        if(top==-1)return true;
        return false;  
    }
}