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
class BalanceBinaryTree {
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        return count(root);
    }
    public static boolean count(TreeNode root){
        if(root == null)
            return true;
        int left = countNode(root.left);
        int right = countNode(root.right);
        if(Math.abs(left-right)<=1 && count(root.left) && count(root.right))
            return true;
        else 
            return false;
    }
    public static int countNode(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(countNode(root.left),countNode(root.right))+1;
    }
}