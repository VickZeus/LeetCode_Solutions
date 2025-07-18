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
    public void inorder(TreeNode root,ArrayList<Integer> l1)
    {   
        if(root==null)return ;
        inorder(root.left,l1);
        if(root.left==null && root.right==null)l1.add(root.val);
        inorder(root.right,l1);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        inorder(root1,l1);
        inorder(root2,l2);
        System.out.println(l1+"  "+l2);
        if(l1.size()!=l2.size())return false;
        return l1.equals(l2);
    }
}