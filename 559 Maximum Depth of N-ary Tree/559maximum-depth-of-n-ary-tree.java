/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int mH;

    public void compute(Node root,int n){

        if(root.children.isEmpty()){
            mH=Math.max(n,mH);
            return;
        }

        for(Node k: root.children){
            compute(k,n+1);
        }
    }

    public int maxDepth(Node root) {
        if(root==null)return 0;
        mH=Integer.MIN_VALUE;
        compute(root,1);
        return mH;
    }
}