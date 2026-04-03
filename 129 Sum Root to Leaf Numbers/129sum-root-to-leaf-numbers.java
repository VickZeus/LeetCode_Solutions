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
    int ans=0;

    public void summer(TreeNode root,int val){
        if(root==null)return;

        val=10*val+root.val;
        if(root.left==null && root.right==null){
            ans+=val;return;
        }
        summer(root.left,val);
        summer(root.right,val);
    }

    public int sumNumbers(TreeNode root) {  
        summer(root,0);
        return ans;
    }
}