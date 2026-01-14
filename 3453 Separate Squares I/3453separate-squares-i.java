class Solution {
    public double totalSum;
    public int[][] squares;

    // public double finder(double yold){
    //     double areaLT=areaBelowY(yold);
    //     double areaGT=totalSum-areaLT;

    //     while(compareArea(areaLT,areaGT)==false){
    //         if(areaLT<areaGT)yold=yold+(yold/2);
    //         if(areaLT>areaGT)yold=yold-yold/2;
    //         areaLT=areaBelowY(yold);
    //         areaGT=totalSum-areaLT;
    //     }
    //     return yold;
    // }

    public double areaBelowY(double ycurr){ //Returns total area below y_curr
        double totSum=0;
        int i=0;
        int n=squares.length;
        while(i<n){
            double top=squares[i][1]+squares[i][2];
            double bottom=squares[i][1];
            double height=Math.min(ycurr,top)-bottom;
            if(height>=0)totSum+=height*squares[i][2];
            i++;
        }
        return totSum;
    }

    public boolean compareArea(double a,double b){
        if(Math.abs(a-b)<=1e-6){
            return true;
        }
        return false;
    }

    public Double[] getTotalArea(){//Gets total Sum 
        double totSum=0;
        double minY=Double.MAX_VALUE,maxY=Double.MIN_VALUE;
        for(int[] k:squares){
            totSum+=(double)k[2]*k[2];
            if(k[1]<minY)minY=k[1];
            if(k[1]+k[2]>maxY)maxY=k[1]+k[2];
        }
        return new Double[]{totSum,minY,maxY};
    }

    public double getY(double y1,double y2){
        double mid=(y1+y2)/2;
        if(y2-y1<=1e-6)return mid;
        
        if(2*areaBelowY(mid)<totalSum)return getY(mid,y2);
        return getY(y1,mid);
    }

    public double separateSquares(int[][] squares) {
        double y_curr,y_max;
        this.squares=squares;
        Double[] arr=getTotalArea();
        totalSum=arr[0];y_curr=arr[1];y_max=arr[2];
        int n=squares.length;
        Arrays.sort(squares,(a,b)->Integer.compare(a[1],b[1]));
        y_curr=getY(y_curr,y_max);
        return y_curr;
    }
}