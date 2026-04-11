class Solution {
    int i;
    HashSet<Character> sym;

    public int compute(String s){
        char ch=' ',op=' ';
        int val=0,num=0;


        while(i<s.length() && ch!=')'){ // stops when ch==)  or i==length
            ch=s.charAt(i);
            if(ch==' '){i++;}
            else if(ch=='('){
                i++;
                if(op!=' '){
                    switch(op){
                        case '+' : val+=compute(s);op=' ';break;
                        case '-' : val=val+(-1)*compute(s);op=' ';break;
                        case '*' : val*=compute(s);op=' ';break;
                        case '/' : val/=compute(s);op=' ';break;
                        default : break;
                    }
                }
                else{
                    val+=compute(s);
                }
                i++;
            }
            else if(sym.contains(ch))// if symbol,set symbol go ahead
            {
                op=ch;
                i++;
            }
            else{ // makes the number
                while(Character.isDigit(s.charAt(i))){
                    num=10*num+(s.charAt(i)-'0');
                    i++;
                }  

                if(op!=' '){
                    switch(op){
                        case '+' : val+=num;op=' ';break;
                        case '-' : val-=num;op=' ';break;
                        case '*' : val*=num;op=' ';break;
                        case '/' : val/=num;op=' ';break;
                        default : break;
                    }
                }
                else{
                    val+=num; // possible only for the first num after (
                }
                num=0;
            } 
        }
        //System.out.println(val);
        return val;
    }




    public int calculate(String s) {
        String k="("+s+")"; 
        i=0;
        sym=new HashSet<>();
        sym.add('+');sym.add('-');sym.add('*');sym.add('/');
        return compute(k);
    }
}