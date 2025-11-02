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
    public void inverter(TreeNode root){
        if(root==null)return;
        
        TreeNode rl=root.left;
        TreeNode rr=root.right;

        root.left=rr;
        root.right=rl;
        inverter(root.left);
        inverter(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        inverter(root);
        return root;
    }
}