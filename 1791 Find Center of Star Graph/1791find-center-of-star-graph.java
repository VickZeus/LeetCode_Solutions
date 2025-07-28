class Solution {
    public int findCenter(int[][] edges){
        HashMap<Integer,HashSet<Integer>> obj=new HashMap<>();
        HashSet<Integer> x;
        for(int[]k:edges){
            x=obj.getOrDefault(k[0],new HashSet<Integer>());x.add(k[1]);obj.put(k[0],x);
            x=obj.getOrDefault(k[1],new HashSet<Integer>());x.add(k[0]);obj.put(k[1],x);
        }
        
        int n=obj.size()-1;
        for(int i:obj.keySet()){
            if(obj.get(i).size()==n)return i;
        }
        return -1;
        
    }
}