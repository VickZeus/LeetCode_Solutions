/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution{
    public List<Integer> rightSideView(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        TreeNode k;
        while(!q.isEmpty()){
            int n=q.size();
            TreeNode last=null;
            for(int i=0;i<n;i++){
                k=q.poll();last=k;
                if(k.left!=null)q.add(k.left);
                if(k.right!=null)q.add(k.right);
            }
            ans.add(last.val);
        }
        return ans;
    }
}