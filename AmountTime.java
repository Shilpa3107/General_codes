import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        val = data;
        left = null;
        right = null;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class AmountTime{
    public static void main(String args[]){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(5);
       root.right = new TreeNode(3);
       root.left.right = new TreeNode(4);
       root.left.right.left = new TreeNode(9);
       root.left.right.right = new TreeNode(2);
       root.right.left = new TreeNode(10);
       root.right.right = new TreeNode(6);
       System.out.println(amountTime(root,3));
    }
    public static int amountTime(TreeNode root, int start){
       HashMap<Integer,List<Integer>> adjacency = new HashMap<>();
       buildAdjacencyList(root,adjacency);
       HashMap<Integer,Boolean> visited = new HashMap<>();
       Queue<Integer> queue = new LinkedList<>();
       queue.add(start);
       visited.put(start,true);
       int time = 0;
       while(!queue.isEmpty()){
        int size = queue.size();
         boolean infect = false;
         for(int i = 0;i<size;i++){
           int current = queue.poll();
           for(int num : adjacency.get(current)){
            if(!visited.getOrDefault(num,false)){
                queue.add(num);
                visited.put(num,true);
                infect = true;
            }
           }
         }
         if(infect)
           time++;
       }
       return time;
    }
    public static void buildAdjacencyList(TreeNode root, HashMap<Integer, List<Integer>> map){
        if(root == null)
          return;
        if(!map.containsKey(root.val)){
            map.put(root.val,new ArrayList<>());
        }
        if(root.left != null){
            map.get(root.val).add(root.left.val);
            map.putIfAbsent(root.left.val,new ArrayList<>());
            map.get(root.left.val).add(root.val);
            buildAdjacencyList(root.left, map);
        }
        if(root.right != null){
            map.get(root.val).add(root.right.val);
            map.putIfAbsent(root.right.val,new ArrayList<>());
            map.get(root.right.val).add(root.val);
            buildAdjacencyList(root.right,map);
        }
    }
}