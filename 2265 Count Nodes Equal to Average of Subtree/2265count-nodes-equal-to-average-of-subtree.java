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
    public int countEq;

    public int[] compute(TreeNode root){
        if(root==null)return new int[2];

        int[] left=compute(root.left);
        int[] right=compute(root.right);

        int[] res=new int[2];
        res[0]=left[0]+right[0]+root.val;
        res[1]=left[1]+right[1]+1;

        if(root.val==(res[0]/res[1]))countEq++;
        return res;
    }

    public int averageOfSubtree(TreeNode root) {
        countEq=0;
        compute(root);
        return countEq;
    }
}