import java.util.HashMap;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
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
class SortBinaryTree{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(4);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(7);
       root.left.right = new TreeNode(6);
       root.right.left = new TreeNode(8);
       root.right.right = new TreeNode(5);
       root.right.left.left = new TreeNode(9);
       root.right.right.left = new TreeNode(10);
       System.out.println(minOperation(root));
    }
    public static int minOperation(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int totalswap = 0;
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
            totalswap += getMinSwap(list);
        }
        return totalswap;
    }
    public static int getMinSwap(ArrayList<Integer> original){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> target = new ArrayList<>(original);
        Collections.sort(target);
        for(int i = 0;i<original.size();i++){
            map.put(original.get(i),i);
        }
        int swap = 0;
        for(int i = 0;i<original.size();i++){
            if(original.get(i) != target.get(i))
              swap++;
            int temp = map.get(target.get(i));
            map.put(original.get(i),temp);
            original.set(temp,original.get(i));
        }
        return swap;
    }
}