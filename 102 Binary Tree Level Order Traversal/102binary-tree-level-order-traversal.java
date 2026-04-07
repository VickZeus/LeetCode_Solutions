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
class Solution 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode k=q.poll();
                level.add(k.val);

                if(k.left!=null)q.add(k.left);
                if(k.right!=null)q.add(k.right);
            }
            result.add(level);
        }
        return result;
    }
}