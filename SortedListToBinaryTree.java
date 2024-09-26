public class SortedListToBinaryTree{
    public static void main(String args[]){
        int nums[] = {-10,-3,0,5,9};
        TreeNode root = binaryTree(nums);
        traversal(root);
    }
    public static TreeNode binaryTree(int nums[]){
        return insert(nums,0,nums.length-1);
    }
    public static TreeNode insert(int nums[], int left, int right){
        if(left > right)
        {
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insert(nums,left,mid-1);
        root.right = insert(nums,mid+1,right);
        return root;
    }
    public static void traversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        traversal(root.left);
        traversal(root.right);
    }
}