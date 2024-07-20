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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh,rh);

        
    }
}



//level order code
// int maxDepth = 0;

//         if(root==null){
//             return maxDepth;
//         }
//         Queue<TreeNode> qt = new LinkedList<TreeNode>();

//         qt.offer(root);
//         while(!qt.isEmpty()){

//             int size = qt.size();
//             maxDepth++;
//             for(int i=0; i<size;i++){
//                 TreeNode temp = qt.peek();
//                 qt.poll();
//                 if(temp.left!=null){
//                     qt.offer(temp.left);
//                 }
//                 if(temp.right!=null){
//                     qt.offer(temp.right);
//                 }
//             }
//         }
        
//         return maxDepth;