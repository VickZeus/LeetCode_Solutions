class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int n=baskets.length;
        int j,count=0;
        boolean flag;
        for(int i:fruits){
            j=0;
            flag=false;
            while(j<n){
                if(baskets[j]>0 && i<=baskets[j]){
                    flag=true;
                    baskets[j]=-1;
                    break;
                }
                j++;
            }
            if(!flag)count++;
        }
        return count;
    }
}