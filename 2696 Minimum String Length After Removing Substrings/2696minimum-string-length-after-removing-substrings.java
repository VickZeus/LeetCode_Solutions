class Solution 
{
    char[] stack;
    int top=-1;


    public void push(char ch)
    {
        stack[++top]=ch;
    }

    public void pop()
    {
        --top;
    }

    public int minLength(String s) 
    {
        stack= new char[s.length()];

        for(char ch:s.toCharArray())
        {
            if(top!=-1 && top<s.length())
            {
                if((stack[top]=='A' && ch=='B')||(stack[top]=='C' && ch=='D'))
                {
                    pop();
                }
                else
                {
                    push(ch);
                }
            }
            else
            {
                push(ch);
            }
        }  
        return top+1;   
    }
}