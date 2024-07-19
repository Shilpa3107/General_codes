class Maximum_Depth {
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        return count(root);
    }
    public static int count(TreeNode root){
        if(root == null)
            return 0;
        int max = Math.max(count(root.left),count(root.right))+1;
        return max;
    }
}