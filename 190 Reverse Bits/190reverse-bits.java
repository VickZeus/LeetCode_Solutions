class Solution {
    public int reverseBits(int n){
        int val=0;
        for(int i=0;i<32;i++){
            val=(val<<1)|(n>>i) & 1;
        }
        return val;
    }
}