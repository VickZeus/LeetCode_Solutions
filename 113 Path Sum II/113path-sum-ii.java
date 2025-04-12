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
    List<List<Integer>> obj;
    public boolean check(TreeNode root, int targetSum,List<Integer> ans)
    {
        if(root==null)return false;
        ans.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(targetSum-root.val==0)
            {
                obj.add(new ArrayList<>(ans));
            }
            ans.remove(ans.size()-1);
            return targetSum-root.val==0;
        }
        Boolean left=check(root.left,targetSum-root.val,ans);
        Boolean right=check(root.right,targetSum-root.val,ans);
        ans.remove(ans.size()-1);
        return left||right;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        List<Integer> ans=new ArrayList<>();
        obj=new ArrayList<>();
        check(root,targetSum,ans);
        return obj;
    }
}