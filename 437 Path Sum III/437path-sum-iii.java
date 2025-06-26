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
    public int count;

    public void countPaths( HashMap<Long,Integer> prefixSum , int target , Long currSum, TreeNode root)
    {
        currSum+=root.val;
        Long sum=currSum-target;
        int valid=prefixSum.getOrDefault(sum,0);
        if(valid!=0)
        {
            count+=valid;
        }
        prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)+1);
        if(root.right!=null)countPaths(prefixSum,target,currSum,root.right);
        if(root.left!=null)countPaths(prefixSum, target,currSum,root.left);

        prefixSum.put(currSum, prefixSum.get(currSum) - 1);
    }

    public int pathSum(TreeNode root, int targetSum) 
    {
        if(root==null)return 0;
        count=0;
        HashMap<Long,Integer> prefixSum=new HashMap<>();
        prefixSum.put((long)0,1);
        countPaths(prefixSum,targetSum,(long)0,root);
        return count;
    }
}