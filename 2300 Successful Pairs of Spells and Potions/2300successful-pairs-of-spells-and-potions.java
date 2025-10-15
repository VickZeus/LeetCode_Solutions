class Solution {
    public int binarySearch(int start,int end,long success,int[] potions,int i){
        if(start>end)return start;
        int mid=(start+end)/2;

        long k=(long)potions[mid]*(long)i;
        if(k<success){
            return binarySearch(mid+1,end,success,potions,i);
        }
        else{
            return binarySearch(start,mid-1,success,potions,i);  
        }
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) { //Brute force approach
        int[] succ=new int[spells.length];int k=0;
        Arrays.sort(potions);
    
        for(int i=0;i<spells.length;i++){
            succ[i]=potions.length-binarySearch(0,potions.length-1,success,potions,spells[i]);
        }
        return succ;
    }
}