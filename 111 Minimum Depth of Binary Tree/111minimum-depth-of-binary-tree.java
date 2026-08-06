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
    int shortD;

    public void compute(TreeNode root,int length){
        if(root.left==null && root.right==null){
            shortD=Math.min(shortD,length);
            return;
        }

        if(root.left!=null)compute(root.left,length+1);
        if(root.right!=null)compute(root.right,length+1);
    }
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        shortD=Integer.MAX_VALUE;
        compute(root,1);
        return shortD;
    }
}