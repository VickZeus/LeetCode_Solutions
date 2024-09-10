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
    static ArrayList<Integer> vals;

    public void inorder(TreeNode root)
    {
        if(root==null)return;
        inorder(root.left);
        Solution.vals.add(root.val);
        inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        Solution.vals=new ArrayList<>();
        inorder(root);
        return vals;
    }
}