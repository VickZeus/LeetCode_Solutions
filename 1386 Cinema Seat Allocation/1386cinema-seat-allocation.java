class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
    
        HashMap<Integer,Integer> arr=new HashMap<>();

        for(int[] k:reservedSeats){
            int x=arr.getOrDefault(k[0],0);
            x|= 1<<k[1];
            arr.put(k[0],x);
        }

        int m1,m2,m3,x,count=2*n;
        boolean left,right,mid;

        m1=1<<2 | 1<<3 | 1<<4 | 1<<5;
        m2=1<<4 | 1<<5 | 1<<6 | 1<<7;
        m3=1<<6 | 1<<7 | 1<<8 | 1<<9;

        for(int i:arr.keySet()){
            x=arr.get(i);
            left=((x&m1)==0);right=((x&m3)==0);mid=((x&m2)==0); 
            
            if (left && right) {
            } else if (left || mid || right) {
                count -= 1;
            }
            else{
                count-=2;
            }
        }
        return count;
    }
}