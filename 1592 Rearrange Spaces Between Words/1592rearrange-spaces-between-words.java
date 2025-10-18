class Solution {
    public String reorderSpaces(String text) {
        StringBuilder obj=new StringBuilder();
        int sp_cnt=0;
        int wc=0;
        for(int i=0;i<text.length()-1;i++){
            if((text.charAt(i)==' ' && text.charAt(i+1)!=' ')||(i==0 && text.charAt(i)!=' '))wc++;//Count words
            if(text.charAt(i)==' ')sp_cnt++; //Count Spaces
        }
        if(text.charAt(text.length()-1)==' ')sp_cnt++;

        int bsp=(wc!=1)?sp_cnt/(wc-1):0;
        int esp=(wc!=1)?sp_cnt%(wc-1):sp_cnt;
        String bs="",es="";

        for(int i=0;i<bsp;i++)bs+=" ";
        
        for(int i=0;i<esp;i++)es+=" ";

        int i=0;
        while(text.charAt(i)==' ')i++;
        
        for(;i<text.length();i++){
            if(text.charAt(i)!=' ')obj.append(text.charAt(i));
            if(wc!=1 && i+1<text.length() && text.charAt(i)!=' ' && text.charAt(i+1)==' '){
                obj.append(bs);wc--;
            }
        }
        obj.append(es);
        return obj.toString();
    }
}