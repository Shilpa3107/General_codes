import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
public class AdjacencyMatrix{
    public static void main(String args[]){
        Integer values[] = {1,5,3,null,4,10,6,9,2};
        TreeNode root = buildTree(values);
        HashMap<Integer, List<Integer>> adjacencey = new HashMap<>();
        buildAdjacencyList(root,adjacencey);
        for(Map.Entry<Integer,List<Integer>> mapEle : adjacencey.entrySet()){
            System.out.println("Node: "+mapEle.getKey()+" -> "+mapEle.getValue());
        }

    }
    public static TreeNode buildTree(Integer values[]){
        if(values == null || values.length == 0)
           return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i < values.length){
            TreeNode current = queue.poll();
            if(values[i] != null){
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if(i<values.length && values[i] != null){
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
    public static void buildAdjacencyList(TreeNode root, HashMap<Integer,List<Integer>> adjacenceyList){
        if(root == null)
          return;
        if(!adjacenceyList.containsKey(root.val))
            adjacenceyList.put(root.val,new ArrayList<>());
        if(root.left != null){
            adjacenceyList.get(root.val).add(root.left.val);
            adjacenceyList.putIfAbsent(root.left.val, new ArrayList<>());
            adjacenceyList.get(root.left.val).add(root.val);
            buildAdjacencyList(root.left,adjacenceyList);
        }
        if(root.right != null){
            adjacenceyList.get(root.val).add(root.right.val);
            adjacenceyList.putIfAbsent(root.right.val,new ArrayList<>());
            adjacenceyList.get(root.right.val).add(root.val);
            buildAdjacencyList(root.right, adjacenceyList);
        }
    }
}