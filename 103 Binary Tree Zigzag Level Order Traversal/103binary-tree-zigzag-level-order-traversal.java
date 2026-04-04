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
class Solution {
    List<List<Integer>> ans;

    public void levelTraversal(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);q.add(null);

        List<Integer> k=new ArrayList<>();
        TreeNode temp;
        boolean ltr=true;

        while(!q.isEmpty()){
            temp=q.poll();
            if(temp==null){
                if(!ltr){Collections.reverse(k);}
                ans.add(new ArrayList<>(k));                
                k=new ArrayList<>();
                ltr=!ltr;
                if(!q.isEmpty())q.add(null);
            }
            else{
                k.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans=new ArrayList<>();
        levelTraversal(root);
        return ans;
    }
}