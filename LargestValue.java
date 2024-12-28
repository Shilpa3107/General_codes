import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
class LargestValue{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right.left = new TreeNode(6);
       root.right.right = new TreeNode(7);
       List<Integer> list = largestValue(root);
       for(int n : list)
         System.out.print(n+" ");
    }
    public static List<Integer> largestValue(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null)
        return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode current = queue.poll();
                list.add(current.val);
                if(current.left != null)
                   queue.offer(current.left);
                if(current.right != null)
                   queue.offer(current.right);
            }
            int max = list.get(0);
            for(int n : list){
                max = Math.max(max,n);
            }
            ans.add(max);
        }
        return ans;
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