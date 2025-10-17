class Solution {
    public HashMap<Integer,Long> hm;

    public void genSum(TreeNode root,int level){
        hm.put(level,hm.getOrDefault(level,0L)+(long)root.val);
        if(root.left!=null)genSum(root.left,level+1);
        if(root.right!=null)genSum(root.right,level+1);
    }

    public int maxLevelSum(TreeNode root) {
        hm=new HashMap<>();
        genSum(root,0);

        long x=-1;int l=-1;
        int tl=-1;
        for(int k:hm.keySet()){
            tl=Math.max(tl,k);
            if(hm.get(k)>x){
                x=Math.max(x,hm.get(k));
                l=k;
            }
        }
        if(x<0)return tl+1;
        return l+1;
    }
}