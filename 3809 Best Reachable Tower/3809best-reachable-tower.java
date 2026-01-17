class Solution {

    public boolean reachable(int[] t,int[] center,int radius){
        long distance=Math.abs(center[0]-t[0])+Math.abs(center[1]-t[1]);
        return (distance<=(long)radius)?true:false;
    }
    
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int maxQ=-1;
        int[] ans={-1,-1};
        for(int[] t:towers){
            if(t[2]>maxQ && reachable(t,center,radius)){
                maxQ=t[2];
                ans[0]=t[0];ans[1]=t[1];
            }
            else if(t[2]==maxQ && reachable(t,center,radius)){
                int diff=ans[0]-t[0]+ans[1]-t[1];
                if(diff>0){
                    ans[0]=t[0];ans[1]=t[1];
                }
            }
        }
        return ans;
    }
}