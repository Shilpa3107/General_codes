public class Dfs{
    public static void main(String args[]){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        System.out.println(pathSum(root,targetSum));
    }
    public static boolean pathSum(TreeNode root, int targetSum){
        if(root == null)
        return false;
        if(root.left == null && root.right == null)
        return targetSum==root.val;
        boolean left = pathSum(root.left,targetSum-root.val);
        boolean right = pathSum(root.right,targetSum-root.val);
        return left||right;
    }
}