class Solution {
    public double HourTime(int hour,int minutes){
        return (double)(30*hour)%360+(minutes/2.0);
    }

    public double MinTime(int minutes){
        return 6*minutes;
    }

    public double angleClock(int hour, int minutes) {
        double dH=HourTime(hour,minutes);
        double dM=MinTime(minutes);
        return Math.min(360-Math.abs(dH-dM),Math.abs(dH-dM));
    }
}