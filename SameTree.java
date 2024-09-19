public class SameTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println(check(root,root1));
    }
    public static boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null)
        return true;
        if(p.val != q.val || p==null || q== null)
        return false;
        return check(p.left,q.left)||check(p.right,q.right);
    }
}