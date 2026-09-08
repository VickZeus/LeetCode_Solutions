class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer>[] list=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++)list[i]=new ArrayList<>();

        for(int i=0;i<prerequisites.length;i++){
            int[] k=prerequisites[i];
            list[k[1]].add(k[0]);
            indegree[k[0]]++;
        }

        for(int i=0;i<numCourses;i++)if(indegree[i]==0)q.add(i);  

        while(!q.isEmpty()){
            int temp=q.poll();
            count++;
            for(int h:list[temp]){
                indegree[h]--;
                if(indegree[h]==0)q.add(h);
            }
        }

        return count==numCourses;
    }
}