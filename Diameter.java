public class Diameter{
    public static int diameter = 0;
    public static void main(String args[]){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(cal(root));
    }

    public static int cal(TreeNode root){
        calculate(root);
        return diameter;
    }
    public static int calculate(TreeNode root){
        if(root == null)
        return 0;
        int left = calculate(root.left);
        int right = calculate(root.right);

        diameter = Math.max(diameter,left+right);
        return Math.max(left,right)+1;
    }
}