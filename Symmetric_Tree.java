import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 class Symmetric_Tree {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        if(getLength(root) == 2 || getLength(root) ==0)
            return false;
        else if(getLength(root) == 1)
            return true;
        
        Stack<TreeNode> stack = new Stack<>();
        //added the left and right subtree of the tree in the stack
        stack.push(root.left);
        stack.push(root.right);
        
        //created two nodes
       TreeNode node1 = new TreeNode();
        TreeNode node2 = new TreeNode();
        
        //conitnue the loop until the stack is empty
        while(!stack.isEmpty()){
            node1 = stack.pop();
            node2 = stack.pop();
            
            //if one of the node becomes empty then continue the process
            if(node1 == null && node2==null)
                continue;
            
            //if either of the node becomes empty then return false
            if(node1==null || node2==null)
                return false;
            
            //if values of the nodes are not equal then it is not symmetric then return false
            if(node1.val != node2.val)
                return false;
            
            
            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node1.right);
            stack.push(node2.left);
        }
        return true;
    }
    public static int getLength(TreeNode root){
        if(root == null)
            return 0;
        return getLength(root.left)+1+getLength(root.right);
    }
}