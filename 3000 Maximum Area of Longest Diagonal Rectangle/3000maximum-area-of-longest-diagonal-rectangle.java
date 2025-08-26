class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diag=-1;
        int area=-1;

        for(int[] k:dimensions){
            int d=k[0]*k[0]+k[1]*k[1];
            int a=k[0]*k[1];

            if(d==diag)area=Math.max(a,area);

            if(d>diag){
                diag=d;
                area=a;
            }   
        }
        return area;
    }
}