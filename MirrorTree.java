public class MirrorTree{
    public static void main(String args[]){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println("Before inverting: ");
        traversal(root);
        System.out.println("\nAfter inverting: ");
        traversal(invert(root));
        
    }
    public static TreeNode invert(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
    public static void traversal(TreeNode root){
        if(root == null)
        return;
        System.out.print(root.val+" ");
        traversal(root.left);
        traversal(root.right);
    }
}