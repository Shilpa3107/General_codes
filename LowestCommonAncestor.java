import java.util.AbstractMap.SimpleEntry;
public class LowestCommonAncestor{
    public static void main(String args[]){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(2);

        TreeNode result = lowestCommonAncestor(root);
        postOrder(result);
    }
    public static void postOrder(TreeNode result){
        if(result == null)
          return;
        postOrder(result.left);
        postOrder(result.right);
        System.out.print(result.val+" ");
    }
    public static TreeNode lowestCommonAncestor(TreeNode root){
        return dfs(root).getKey();
    }
    public static SimpleEntry<TreeNode,Integer> dfs(TreeNode root){
        if(root == null)
          return new SimpleEntry<>(null,0);
        
        SimpleEntry<TreeNode,Integer> left = dfs(root.left);
        SimpleEntry<TreeNode,Integer> right = dfs(root.right);

        if(left.getValue() > right.getValue())
          return new SimpleEntry<>(left.getKey(),left.getValue()+1);

        if(right.getValue() > left.getValue())
          return new SimpleEntry<>(right.getKey(),right.getValue()+1);

        return new SimpleEntry<>(root,left.getValue()+1);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}