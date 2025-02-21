import java.util.HashSet;
public class ContaminatedTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);
        findElements(root);
        System.out.println(find(1));
        System.out.println(find(2));
    }
    static HashSet<Integer> seen;
    public static void findElements(TreeNode root){
       seen = new HashSet<>();
       dfs(root,0);
    }
    public static boolean find(int target){
        return seen.contains(target);
    }
    public static void dfs(TreeNode root, int currValue){
        if(root == null)
          return;
        seen.add(currValue);
        dfs(root.left,currValue*2+1);
        dfs(root.right,currValue*2+2);
    }
    
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}