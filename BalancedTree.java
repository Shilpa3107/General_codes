public class BalancedTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        if(check(root))
        System.out.println("It is balanced tree");
        else 
        System.out.println("It is not a balanced tree");
    }
    public static boolean check(TreeNode root){
       if(count(root) == -1)
          return false;
     return true;
    }
    public static int count(TreeNode root){
        if(root == null)
        return 0;
        int left = count(root.left);
        int right = count(root.right);
        if(left==-1 || right == -1)
        return -1;
        if(Math.abs(left-right) > 1)
        return -1;
        return Math.max(left,right)+1;
    }
}