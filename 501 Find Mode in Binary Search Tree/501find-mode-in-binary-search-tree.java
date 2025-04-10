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
    HashMap<Integer,Integer> obj=new HashMap<>();
    int max=0;

    public void getMode(TreeNode root)
    {
        if(root!=null)
        {
            obj.put(root.val,obj.getOrDefault(root.val,0)+1);
            max=(max>obj.get(root.val))?max:obj.get(root.val);
        }
        if(root.left!=null)getMode(root.left);
        if(root.right!=null)getMode(root.right);
    } 

    public int[] findMode(TreeNode root) 
    {
        getMode(root);
        int count=0;
        for(int i:obj.keySet())
        {
            if(obj.get(i)==max)count++;
        }

        int[] ans=new int[count];
        int k=0;
        for(int i:obj.keySet())
        {
            if(obj.get(i)==max)ans[k++]=i;
        }
        return ans;
    }
}