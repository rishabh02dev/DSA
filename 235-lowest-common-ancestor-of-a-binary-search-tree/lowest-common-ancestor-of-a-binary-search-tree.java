/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = findLCA(root,p,q);
        return lca;
    }

    static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;

        if(root.val>p.val && root.val>q.val){
            return findLCA(root.left, p, q);
        }
        else if(root.val<p.val && root.val<q.val){
            return findLCA(root.right, p, q);
        }
        else{
            return root;
        }
    }
}