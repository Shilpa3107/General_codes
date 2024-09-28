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
class ValidBST {
    public static void main(String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root) {
        return check(root,-10e9,10e9)
;    }
    public static boolean check(TreeNode root,double min, double max){
        if(root == null)
            return true;
        if(root.val <= min || root.val >= max)
            return false;
        return check(root.left,min,root.val)&& check(root.right,root.val,max);
    }
}