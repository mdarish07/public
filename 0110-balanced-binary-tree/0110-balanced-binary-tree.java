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
    int Height(TreeNode root){
          if(root==null)
        return 0;
        
        int Lh=Height(root.left);
        int Rh=Height(root.right);

return Math.max(Lh,Rh)+1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;

        int Lh=Height(root.left);
        int Rh=Height(root.right);

        if(Math.abs(Lh-Rh)>1)
        return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }
}