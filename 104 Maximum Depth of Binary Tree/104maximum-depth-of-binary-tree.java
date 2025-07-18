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
    int maxn=0;

    public void calc(TreeNode root,int c)
    {
        if(c>maxn)maxn=c;
        if(root.left!=null)calc(root.left,c+1);
        if(root.right!=null)calc(root.right,c+1);
    }

    public int maxDepth(TreeNode root) 
    {
        if(root==null)return 0;
        calc(root,1);
        return maxn;
    }
}