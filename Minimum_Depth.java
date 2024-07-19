class Minimum_Depth {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(minDepth(root));
    }
    public static int minDepth(TreeNode root) {
        return count(root);
    }
    public static int count(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        if(root.left==null)
            return count(root.right)+1;
        if(root.right==null)
            return count(root.left)+1;
        return Math.min(count(root.left),count(root.right))+1;
    }
}