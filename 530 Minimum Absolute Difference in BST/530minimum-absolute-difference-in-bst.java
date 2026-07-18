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
    ArrayList<Integer> ans;

    public void inorder(TreeNode root){
        if(root==null)return;

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        ans=new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        inorder(root);

        for(int i=1;i<ans.size();i++){diff=Math.min(diff,ans.get(i)-ans.get(i-1));}
        return diff;
    }
}