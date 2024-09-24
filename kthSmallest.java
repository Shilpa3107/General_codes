import java.util.ArrayList;
import java.util.Collections;
public class kthSmallest{
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        System.out.println(smallest(root,k));
    }
    public static int smallest(TreeNode root, int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        traversal(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public static void traversal(TreeNode root, ArrayList<Integer> list){
        if(root == null)
        return;
        traversal(root.left,list);
        list.add(root.val);
        traversal(root.right,list);
    }
}