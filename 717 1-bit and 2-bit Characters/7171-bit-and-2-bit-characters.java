class Solution {
    boolean ans;
    public void calc(int[] arr,int j){
        if(j==arr.length-1){
            if(arr[j]==0)ans=true;
            return;
        }
        if(j>=arr.length)return;

        if(arr[j]==1){
            calc(arr,j+2);
        }
        else{
            calc(arr,j+1);
        }
    }
    public boolean isOneBitCharacter(int[] bits) {
        ans=false;
        if(bits.length==1){
            return (bits[0]==0)?true:false;
        }
        calc(bits,0);
        return ans;
    }
}