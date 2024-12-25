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
    public List<Integer> largestValues(TreeNode root) 
    {  
        if(root==null)return new ArrayList<Integer>();
        ArrayList<Integer> num=new ArrayList<>();
        Queue<TreeNode> obj=new LinkedList<>();
        obj.add(root);
        while(!obj.isEmpty())   
        {
            int length=obj.size();
            int maxn=Integer.MIN_VALUE;
            for(int i=0;i<length;i++)
            {
                TreeNode k=obj.remove();
                if(k==null)continue;
                if(k.left!=null)obj.add(k.left);
                if(k.right!=null)obj.add(k.right);
                maxn=(maxn>k.val)?maxn:k.val;
            }
            num.add(maxn);
        }   
        return num;
    }
}