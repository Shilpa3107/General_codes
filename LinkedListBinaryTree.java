public class LinkedListBinaryTree{
    public static void main(String args[]){
       ListNode head = new ListNode(4);
       head.next = new ListNode(2);
       head.next.next = new ListNode(8);
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(4);
       root.right = new TreeNode(4);
       root.left.right = new TreeNode(2);
       root.left.right.left = new TreeNode(1);
       root.right.left = new TreeNode(2);
       root.right.left.left = new TreeNode(6);
       root.right.left.right = new TreeNode(8);
       root.right.left.right.left = new TreeNode(1);
       root.right.left.right.right = new TreeNode(3);
       System.out.println(subPath(root,head));
    }
    public static boolean subPath(TreeNode root,ListNode head){
        if(root==null)
        return true;
        return checkPath(root,head);
    }
    public static boolean checkPath(TreeNode root, ListNode head){
        if(root == null)
          return false;
          if(dfs(root,head))
          return true;
          return checkPath(root.left,head)||checkPath(root.right,head);
    }
    public static boolean dfs(TreeNode root, ListNode head){
        if(head == null)
        return true;
        if(root == null)
        return false;
        if(root.val != head.val)
        return false;
        return dfs(root.left,head.next)||dfs(root.right,head.next);
    }
}