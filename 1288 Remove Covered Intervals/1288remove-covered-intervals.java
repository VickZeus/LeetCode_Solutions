class Solution {
    public int compute(int[][] intervals){
        Stack<int[]> stk=new Stack<>();
        int[] top;
        for(int[] k:intervals){
            if(stk.size()!=0){
                top=stk.pop();
            }
            else{
                stk.push(k);continue;
            }

            if(top[0]<=k[0] && top[1]>=k[1]){
                stk.push(top);continue;
            }
            else if(top[0]==k[0] && top[1]<k[1]){
                stk.push(k);continue;
            }
            else{
                stk.push(top);stk.push(k);
            }
        }
        return stk.size();
    }

    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        return compute(intervals);
    }
}