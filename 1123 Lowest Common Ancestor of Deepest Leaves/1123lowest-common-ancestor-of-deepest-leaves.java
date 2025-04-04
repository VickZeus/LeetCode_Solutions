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
    int d=0;

    public void depth(TreeNode root,int c)
    {
        if(root.left==null && root.right==null)
        {
            d=(d>c)?d:c;
            return;
        }

        if(root.left!=null && root.right!=null)
        {
            depth(root.left,c+1);
            depth(root.right,c+1);
        }

        if(root.left==null)depth(root.right,c+1);
        if(root.right==null)depth(root.left,c+1);
    }


    public TreeNode LCA(TreeNode root,int c)
    {
        if(c==d)return root;

        TreeNode left=null;
        TreeNode right=null;
        if(root.left!=null)left=LCA(root.left,c+1);
        if(root.right!=null)right=LCA(root.right,c+1);

        if(left!=null && right!=null)return root;
        if(left!=null)return left;
        if(right!=null)return right;
        return null ;
    }


    public TreeNode lcaDeepestLeaves(TreeNode root) 
    {
        if(root.left==null && root.right==null)return root;
        depth(root,0);
        System.out.println(d);
        return LCA(root,0);
    }
}