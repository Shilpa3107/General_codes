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
class SubtreeOfAnotherTree {
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        System.out.println(isSubtree(root,subRoot));
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root == null)
          return false;
      if(isIdentical(root,subRoot))
          return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public static boolean isIdentical(TreeNode root, TreeNode subRoot)
    {
        if(root == null && subRoot==null)
            return true;
        if(root==null||subRoot==null)
            return false;
        return (root.val == subRoot.val) && isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
    }
}