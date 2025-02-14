import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrder{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right.left = new TreeNode(6);
       root.right.right = new TreeNode(7);
       List<List<Integer>> list = levelOrder(root);
       for(List<Integer> l : list){
        for(int n : l)
          System.out.print(n+" ");
        System.out.println();
       }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null)
         return lists;
         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> current = new ArrayList<>();
            for(int i = 0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                current.add(currNode.val);
              
                if(currNode.left != null)
                  queue.offer(currNode.left);

                if(currNode.right != null)
                  queue.offer(currNode.right);
            }
            lists.add(current);
         }
         return lists;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    TreeNode(int data,TreeNode left, TreeNode right){
        val = data;
        this.left = left;
        this.right = right;
    }
}