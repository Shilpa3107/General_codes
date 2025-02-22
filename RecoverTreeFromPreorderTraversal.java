public class RecoverTreeFromPreorderTraversal{
    public static void main(String args[]){
      String traversal = "1-2--3--4-5--6--7";
      TreeNode root = recoverTreeFromPreorderTraversal(traversal);
       inorderTraversal(root);
    }
    public static void inorderTraversal(TreeNode root){
        if(root == null)
          return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    static int index;
    public static TreeNode recoverTreeFromPreorderTraversal(String traversal){
         index = 0;
         return insertNode(traversal,0);
    }
    public static TreeNode insertNode(String traversal, int depth){
        if(index >= traversal.length())
          return null;
        
        int dashes = 0;
        while((index+dashes) < traversal.length() && traversal.charAt(index+dashes) == '-')
          dashes++;

        if(dashes != depth)
          return null;

        index += dashes;

        int value = 0;

        while(index < traversal.length() && Character.isDigit(traversal.charAt(index)))
           value = value*10+(traversal.charAt(index++)-'0');

        TreeNode root = new TreeNode(value);

        root.left = insertNode(traversal,depth+1);
        root.right = insertNode(traversal,depth+1);

        return root;

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
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}