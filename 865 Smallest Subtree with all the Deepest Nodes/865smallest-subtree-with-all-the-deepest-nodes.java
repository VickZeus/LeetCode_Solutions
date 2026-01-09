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
    public int max_d,count_node;
    public TreeNode subTree;

    public void update(TreeNode root,int depth){ //Finds the node_count and max_depth
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(depth>max_d){
                max_d=depth;
                count_node=1;
            }
            else if(depth==max_d){
                count_node+=1;
            }
            return;
        }

        update(root.left,depth+1);
        update(root.right,depth+1);
    }


    public int findST(TreeNode root,int depth){ //Finds the subTree
        if(root==null)return 0;
        int count=0;
        if(depth==max_d && root.left==null && root.right==null)
        {
            count=1;
        }
        else{
            count=findST(root.left,depth+1)+findST(root.right,depth+1);
        }
    
        if(count==count_node && subTree==null)subTree=root;
        return count;
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root){
        max_d=-1;
        count_node=0;
        subTree=null;

        update(root,0);
        findST(root,0);
        return subTree;
    }
}