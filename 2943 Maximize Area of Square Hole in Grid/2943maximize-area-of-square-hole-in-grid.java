class Solution {

    public int getCons(int[] hBars){
        int horizontalCons=1,consecutive=0;
        for(int i=0;i<hBars.length-1;i++){
            if(hBars[i+1]-hBars[i]!=1){
                horizontalCons=Math.max(horizontalCons,consecutive+1);
                consecutive=0;
            }
            else{
                consecutive++;
            }
        }
        horizontalCons=Math.max(horizontalCons,consecutive+1);
        return horizontalCons;
    }

    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        return (int)Math.pow(Math.min(getCons(hBars),getCons(vBars))+1,2);
    }
}