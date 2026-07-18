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
    int totalTilt;

    public int compute(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=0,right=0;
        if(root.left!=null){left=compute(root.left);}
        if(root.right!=null){right=compute(root.right);}

        totalTilt+=Math.abs(left-right);
        return left+right+root.val;
    }

    public int findTilt(TreeNode root) {
        totalTilt=0;
        compute(root);
        return totalTilt;
    }
}