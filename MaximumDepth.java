public class MaximumDepth{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root){
        //if root is null then depth is 0
        if(root == null)
          return 0;

        //calculate the left subtree depth
        int left = maxDepth(root.left);

        //calculate the right subtree depth
        int right = maxDepth(root.right);

        //return the maximum of two
        return Math.max(left,right)+1;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}