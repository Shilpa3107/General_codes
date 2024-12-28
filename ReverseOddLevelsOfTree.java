import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
class ReverseOddLevelsOfTree{
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("Before function : ");
        printTree(root);
        System.out.println("\nAfter function : ");
        reverseOddLevelsOfTree(root);
        printTree(root);
    } 
    public static void printTree(TreeNode root){
        if(root == null)
          return;
        printTree(root.left);
            System.out.print(root.val+" ");
            printTree(root.right);

    }
    public static void reverseOddLevelsOfTree(TreeNode root){
        HashMap<Integer,ArrayList<TreeNode>> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<TreeNode> list = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode current = queue.poll();
                list.add(current);
                if(current.left != null)
                  queue.offer(current.left);
                if(current.right != null)
                  queue.offer(current.right);
            }
            if(level %2 != 0)
              map.put(level,list);
            level++;
        }
         for(int odd : map.keySet()){
           ArrayList<TreeNode> list = map.get(odd);
           int left = 0;
           int right = list.size()-1;
           while(left < right){
            int temp = list.get(left).val;
            list.get(left).val = list.get(right).val;
            list.get(right).val = temp;
            left++;
            right--;
           }
         }

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