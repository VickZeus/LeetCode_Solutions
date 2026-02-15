class Solution {
    public String addBinary(String a, String b) {
        int n=0,m=0;
        int carry=0,value=0;
        StringBuilder obj=new StringBuilder();
        int n1=a.length()-1,n2=b.length()-1;

        while(n1>-1 && n2>-1){
            n=a.charAt(n1)-'0';
            m=b.charAt(n2)-'0';
            value=(n^m)^carry;
            carry=(n&m)|(carry&(n^m));
            obj.append(value);
            n1--;n2--;
        }

        while(n1>-1){
            n=a.charAt(n1)-'0';
            value=(n^carry);
            carry=carry&n;
            obj.append(value);n1--;
        }

        while(n2>-1){
            m=b.charAt(n2)-'0';
            value=(m^carry);
            carry=carry&m;
            obj.append(value);n2--;    
        }

        if(carry==1)obj.append(carry);
        obj.reverse();
        return obj.toString();
    }
}