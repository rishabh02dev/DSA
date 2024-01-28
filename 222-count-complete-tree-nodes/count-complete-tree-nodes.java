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

    static int findHeightLeft(TreeNode root){
        int h = 0;
        while(root!=null){
            h++;
            root = root.left;
        }

        return h;
    }

     static int findHeightRight(TreeNode root){
        int h = 0;
        while(root!=null){
            h++;
            root = root.right;
        }

        return h;
    }



    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int lh = findHeightLeft(root);
        int rh = findHeightRight(root);

        if(lh==rh) return (1<<lh) -1;

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return 1+ leftNodes+rightNodes;
    }
}