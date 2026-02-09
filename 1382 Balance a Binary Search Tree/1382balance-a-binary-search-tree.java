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
    TreeNode head;
    public void inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null)return;
        TreeNode left=root.left,right=root.right;
        root.left=null;root.right=null;
        inorder(left,arr);
        arr.add(root);
        inorder(right,arr);
    }

    public TreeNode makeTree(ArrayList<TreeNode> arr,int start,int end){
        if(start>end)return null;

        int mid=(start+end)/2;
        TreeNode curr=arr.get(mid);
        if(head==null)head=curr;
        curr.left=makeTree(arr,start,mid-1);
        curr.right=makeTree(arr,mid+1,end);
        return curr;
    }   

    public TreeNode balanceBST(TreeNode root) {
        head=null;
        ArrayList<TreeNode> arr=new ArrayList<>(); //List of disconnected nodes
        inorder(root,arr);
        makeTree(arr,0,arr.size()-1);
        return head;
    }
}