class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)return 1;
        if(trust.length==0)return -1;
        Map<Integer,int[]> obj=new HashMap<>();
        int[] arr,arr2;
        for(int[] i:trust){
            arr=obj.getOrDefault(i[1],new int[2]);
            arr2=obj.getOrDefault(i[0],new int[2]);

            obj.put(i[0],new int[]{arr2[0]+1,arr2[1]});
            obj.put(i[1],new int[]{arr[0],arr[1]+1});
        }

        int judge=-1;
        for(int i=1;i<=n;i++){
            int[] k=obj.getOrDefault(i,new int[2]);
            if(k[0]==0 && k[1]==n-1){
                if(judge!=-1)return -1;
                judge=i;
            }
        }
        return judge;
    }
}