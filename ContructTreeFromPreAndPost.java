public class ContructTreeFromPreAndPost{
    public static void main(String args[]){
         int preorder[] = {1,2,4,5,3,6,7};
         int postorder[] = {4,5,2,6,7,3,1};
         TreeNode root = constructTreeFromPreAndPost(preorder,postorder);
         printTree(root);
    }
    public static void printTree(TreeNode root){
        if(root == null)
          return;
        printTree(root.left);
        System.out.print(root.val+" ");
        printTree(root.right);
    }
    public static TreeNode constructTreeFromPreAndPost(int preorder[], int postorder[]){
        return buildTree(preorder,postorder);
    }
    static int preIndex = 0;
    static int postIndex = 0;
    public static TreeNode buildTree(int preorder[], int postorder[]){
        TreeNode root = new TreeNode(preorder[preIndex++]);

        if(root.val != postorder[postIndex])
           root.left = buildTree(preorder,postorder);

        if(root.val != postorder[postIndex])
           root.right = buildTree(preorder,postorder);

        postIndex++;
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