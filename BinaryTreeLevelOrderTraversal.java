import java.util.ArrayList;
import java.util.List;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeLevelOrderTraversal {
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrder(root);
        for(List<Integer> l: list)
        System.out.print(l+" ");
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
        bfs(root,0,result);
        return result;
    }
    public static void bfs(TreeNode root, int level, List<List<Integer>> result){
        if(root == null)
           return;
        if(result.size() < level+1)
            result.add(new ArrayList<>());
        result.get(level).add(root.val);
        bfs(root.left,level+1,result);
        bfs(root.right,level+1,result);
    }
}