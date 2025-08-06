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

    public TreeNode findNode(TreeNode n,int val)
    {
        if(n==null)return null;

        if(val>n.val)return findNode(n.right,val);
        if(val==n.val)return n;
        if(val<n.val)return findNode(n.left,val);
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return findNode(root,val);
    }
}