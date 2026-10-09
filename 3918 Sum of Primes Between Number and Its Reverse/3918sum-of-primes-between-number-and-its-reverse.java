class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0,temp=n,sum=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }

        int i=Math.min(rev,n);
        n=Math.max(rev,n);

        for(;i<=n;i++){
            if(i==1)continue;
            int x=2; boolean flag=true;
            while(x<=(int)Math.sqrt(i)){
                flag=(i%x!=0);
                if(!flag)break;
                x++;
            }
            sum+=(flag)?i:0;
        }
        return sum;
    }
}