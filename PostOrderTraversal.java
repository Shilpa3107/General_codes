 import java.util.List;
 import java.util.ArrayList;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class PostOrderTraversal {
    public static void main(String args[]){
        TreeNode root = new TreeNode();
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        check(root,list);
        return list;
    }
    public static void check(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        check(root.left,list);
        check(root.right,list);
        list.add(root.val);
    }
}