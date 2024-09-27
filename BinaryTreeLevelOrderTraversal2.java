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
class BinaryTreeLevelOrderTraversal2 {
    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = levelOrderBottom(root);
        for(List<Integer> l: list)
        System.out.print(l+" ");
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> list = new ArrayList<>(); 
        bfs(root,0,list);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;
            
    }
    public static void bfs(TreeNode root, int level, List<List<Integer>> list){
        if(root == null)
            return;
        if(list.size() < level+1)
            list.add(new ArrayList<>());
        list.get(level).add(root.val);
        bfs(root.left,level+1,list);
        bfs(root.right,level+1,list);
    }
    
}