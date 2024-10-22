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
    ArrayList<Long> suma=new ArrayList<>(); // Contains sum of each level. 
    ArrayList<TreeNode> nodea=new ArrayList<>(); // Contains nodes each level.
    int level=0;
    public long summer(int k)
    {
        if(k>level)return -1;
        //System.out.println(suma.toString());
        long[] arr=new long[suma.size()];int i=0;
        for(long j:suma)arr[i++]=j;
        Arrays.sort(arr);
        return arr[arr.length-k];
    }

    public void sumcal(ArrayList<TreeNode> node)
    {
        ++level;
        ArrayList<TreeNode> nodea2=new ArrayList<>();
        long sum=0;
        for(TreeNode i:nodea)
        {
            if(i!=null)
            {
                sum+=i.val;
                nodea2.add(i.left);nodea2.add(i.right); // adding left and right node 
            }
        }
        suma.add(sum);
        nodea=nodea2;
        boolean flag=true;
        for(TreeNode k:nodea)
        {
            flag=flag&&(k==null);
        }
        if(!flag)sumcal(nodea);
    }

    public long kthLargestLevelSum(TreeNode root, int k) 
    {
        nodea.add(root);
        sumcal(nodea);
        long k2=summer(k);
        return k2;
    }

}