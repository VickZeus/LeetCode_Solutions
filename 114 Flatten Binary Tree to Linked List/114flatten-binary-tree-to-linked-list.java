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
    TreeNode prev;

    public void flatter(TreeNode root){
        if(root==null)return;

        TreeNode l=root.left;
        TreeNode r=root.right;

        if(prev!=null){
            prev.left=null;
            prev.right=root;
        }
        prev=root;

        flatter(l);
        flatter(r);
    }

    public void flatten(TreeNode root) {
        flatter(root);
    }
}