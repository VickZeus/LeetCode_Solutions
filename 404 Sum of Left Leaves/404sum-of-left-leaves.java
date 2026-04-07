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
    int sumL;

    public void summer(TreeNode root,char ch){
        if(root.left==null && root.right==null && ch=='l'){sumL+=root.val;return;}
        if(root.left==null && root.right==null)return;


        if(root.left!=null)summer(root.left,'l');
        if(root.right!=null)summer(root.right,'r');
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sumL=0;
        summer(root,' ');
        return sumL;
    }
}