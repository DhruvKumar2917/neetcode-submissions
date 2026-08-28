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

    boolean checkIsSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return root == subRoot;


        if(root.val != subRoot.val) return false;

        return checkIsSubtree(root.left, subRoot.left) && checkIsSubtree(root.right, subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null) return false;
        if(checkIsSubtree(root,subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
}
