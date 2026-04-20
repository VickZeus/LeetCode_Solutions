class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int val=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(colors[i]!=colors[j])val=Math.max(val,Math.abs(i-j));
            }
        }
        return val;
    }
}