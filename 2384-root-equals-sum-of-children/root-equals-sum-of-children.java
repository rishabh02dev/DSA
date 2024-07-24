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
    public boolean checkTree(TreeNode root) {
        if(root==null){
            return true;
        }

        if(isSum(root)){
            return true;
        }else{
            return false;
        }
    }

    static boolean isSum(TreeNode node){
        if(node==null || (node.left==null && node.right==null)){
            return true;
        }

        int lsum = (node.left!=null) ? node.left.val : 0;
        int rsum = (node.right!=null) ? node.right.val : 0;

        if(lsum+rsum!=node.val){
            return false;
        }

        return isSum(node.left) && isSum(node.right);
    }
}