class Solution {

    public int check(long xxr,long leftn,long rightn){
        long squared,rev,temp2;

        if(xxr>=leftn && xxr<=rightn){ // when the palindrome formed is in the range
            squared=xxr*xxr; // square of the xxr
            temp2=squared;
            rev=0;

            while(temp2>0){
                rev=rev*10+temp2%10;
                temp2=temp2/10;
            }
            if(rev-squared==0){
                return 1;
            }
        }
        return 0;
    }

    public int superpalindromesInRange(String left, String right) {
        long leftk=Long.valueOf(left);
        long rightk=Long.valueOf(right);

        long leftn=(long)Math.sqrt(leftk);
        long rightn=(long)Math.sqrt(rightk);

        int count=0;
        long temp,xxr;
        

        for(int x=1;x<100000;x++){
            xxr=x;
            temp=x;

            while(temp>0){ //Generates even palindromes only
                xxr=xxr*10+temp%10;
                temp=temp/10;
            }
            count+=check(xxr,leftn,rightn);//xxr is the palindrome number ofr even length

            temp=x/10;
            xxr=x;
            while(temp>0){//Generates odd palindromes only
                xxr=xxr*10+temp%10;
                temp=temp/10;
            }
            count+=check(xxr,leftn,rightn);

        }
        return count;
    }
}