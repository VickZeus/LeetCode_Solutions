class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);Arrays.sort(s);

        int contend=0;
        for(int size:s){
            for(int i=0;i<g.length;i++){
                if(g[i]!=-1 && g[i]<=size){
                    g[i]=-1;contend++;break;
                }
            }
        }
        return contend;
    }
}