import java.util.ArrayList;
import java.lang.StringBuilder;

class Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another {
    public static void main(String args[]){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(4);
        System.out.println(getDirections(root,3,6));
    }
    public static String getDirections(TreeNode root, int startValue, int destValue) {
        ArrayList<String> start = new ArrayList<String>();
        ArrayList<String> dest = new ArrayList<String>();
        
        findPath(start,startValue,root);
        findPath(dest,destValue,root);
        
        int i = 0;
        while(i<start.size() && i<dest.size() && start.get(i).equals(dest.get(i)))
            i++;
        
        StringBuilder sb = new StringBuilder();
        for(int j = i;j<start.size();j++)
            sb.append("U");
        
        for(int j = i;j<dest.size();j++)
            sb.append(dest.get(j));
        
        
        return sb.toString();
    }
    public static boolean findPath(ArrayList<String> path, int value, TreeNode root){
        if(root==null)
            return false;
        
        if(root.val == value)
            return true;
        
        path.add("L");
        if(findPath(path,value,root.left))
            return true;
        
        path.remove(path.size()-1);
        
        path.add("R");
        if(findPath(path,value,root.right))
            return true;
        
        path.remove(path.size()-1);
        
        return false;
        
    }
}