class Solution {
    public boolean find(int k,int destination,HashMap<Integer,Boolean> path,HashMap<Integer,HashSet<Integer>> obj){
        if(k==destination)return true;
        if(obj.get(k).contains(destination))return true;
        if(path.getOrDefault(k,false))return false;

        path.put(k,true);
        for(int j:obj.get(k)){
            if(find(j,destination,path,obj))return true;            
        }

        return false;
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        HashMap<Integer,HashSet<Integer>> obj=new HashMap<>();
        HashSet<Integer> x;

        for(int[] k:edges){ //Bidirectional Edge
            x=obj.getOrDefault(k[0],new HashSet<Integer>());x.add(k[1]);obj.put(k[0],x);
            x=obj.getOrDefault(k[1],new HashSet<Integer>());x.add(k[0]);obj.put(k[1],x);
        }

        HashMap<Integer,Boolean> path;
        if(!obj.containsKey(source) || !obj.containsKey(destination))return false;
        for(int k:obj.get(source)){
            path=new HashMap<>();
            path.put(source,true);
            boolean flag=find(k,destination,path,obj);
            if(flag)return true;
        }
        return false;
    }
}