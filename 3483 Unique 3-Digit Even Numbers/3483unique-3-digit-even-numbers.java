class Solution {
    public int totalNumbers(int[] digits) {
        int count=0,a,b,c;

        int[] freq=new int[10];
        for(int i:digits)freq[i]+=1;

        for(int k=100;k<1000;k++){
            c=k%10;
            b=(k%100-c)/10;
            a=k/100;

            if(c%2==1 || freq[a]==0 || freq[b]==0 || freq[c]==0)continue;
            if(a==b && b==c && freq[a]<3 )continue;
            if(a==b && freq[a]<2 )continue;
            if(b==c && freq[b]<2 )continue;
            if(a==c && freq[a]<2 )continue;
            count++;
        }
        return count;
    }
}