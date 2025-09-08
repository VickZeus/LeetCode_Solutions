class Solution {

    public boolean check(int a){
        while(a>0){
            int rem=a%10;
            if(rem==0)return false;
            a=a/10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int a=1;a<n;a++){
            int b=n-a;
            if(check(a) && check(b)){
                arr[0]=a;arr[1]=b;
                return arr;
            }
        }
        return arr;
    }
}