import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
class OddLevelsOfTree{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right.left = new TreeNode(6);
       root.right.right = new TreeNode(7);
       System.out.println(oddLevelsOfTree(root));
    }
    public static HashMap<Integer, ArrayList<Integer>> oddLevelsOfTree(TreeNode root){
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        if(root == null)
          return map;
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i<size;i++){
                TreeNode current = queue.poll();
                list.add(current.val);
                if(current.left != null)
                   queue.offer(current.left);
                if(current.right != null)
                   queue.offer(current.right);
            }
            if(level%2 != 0)
              map.put(level,list);
            level++;
        }
        return map;
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