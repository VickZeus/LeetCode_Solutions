class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1)return 0;
        int i=0,cost=0,n=points.length;
        while(i+1<n){
            if(points[i][0]==points[i+1][0]){
                cost+=Math.abs(points[i+1][1]-points[i][1]);
            }
            else if(points[i][1]==points[i+1][1]){
                cost+=Math.abs(points[i+1][0]-points[i][0]);
            }
            else{
                cost+=Math.max(Math.abs(points[i+1][0]-points[i][0]),Math.abs(points[i+1][1]-points[i][1]));
            }
            i++;
        }
        return cost;
    }
}