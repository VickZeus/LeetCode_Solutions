class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int max=-1;
        for(int i:friends){
            if(i>max)max=i;
        }
        
        boolean[] exists=new boolean[max+1];
        for(int i:friends)exists[i]=true;

        int[] ans=new int[friends.length];
        int index=0;
        for(int i:order){
            if(i<=max && exists[i])ans[index++]=i;
        }
        return ans;
    }
}