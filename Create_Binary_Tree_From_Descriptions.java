 import java.util.HashMap;
 import java.util.HashSet;
 
class Create_Binary_Tree_From_Descriptions {
    public static void main(String args[]){
        int descriptions[][] = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode root = createBinaryTree(descriptions);
        print(root);
    }
    public static void print(TreeNode root){
        if(root != null){
            print(root.left);
            System.out.print(root.val+" ");
            print(root.right);
        }
    }
    public static TreeNode createBinaryTree(int[][] descriptions) {
       HashMap<Integer,TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele[] : descriptions){
            int parent = ele[0];
            int child = ele[1];
            boolean isLeft = (ele[2]==1);
            
            TreeNode parentNode = map.getOrDefault(parent,new TreeNode(parent));
            map.put(parent,parentNode);
            
            TreeNode childNode = map.getOrDefault(child,new TreeNode(child));
            map.put(child,childNode);
            
            if(isLeft)
                parentNode.left = childNode;
            else
                parentNode.right = childNode;
            
            set.add(child);
        }
        
        TreeNode root = null;
        for(int value: map.keySet()){
            if(!set.contains(value)){
                root = map.get(value);
                break;
            }
        }
        return root;
    }
}