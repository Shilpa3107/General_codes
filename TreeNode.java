import java.util.ArrayList;
class LevelsOfTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right  = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("Level of a tree : "+findLevel(root));
    }
    public static int findLevel(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorderTraversal(root,list);
        int size = list.size();
        int level = (int)Math.log(size+1);
        return level;
    }
    public static void inorderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null)
          return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
}
public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}