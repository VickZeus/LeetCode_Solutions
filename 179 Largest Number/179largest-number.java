class Solution {
    public String largestNumber(int[] nums) {
        boolean flag=false;
        for(int i:nums){if(i>0){flag=true;break;}}
        if(!flag)return "0";
        
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)-> (b+a).compareTo(a+b));
        String ans="";

        for(int i:nums)pq.add(String.valueOf(i));

        while(!pq.isEmpty()){ans+=pq.poll();}
        return ans;
    }
}