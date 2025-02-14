import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class ConstructBinaryTree {
    public static void main(String args[]) {
        int preorder[] = {1, 2, 3, 4};
        int inorder[] = {2, 1, 3, 4};

        Node root = buildTree(preorder, inorder); // Fixed argument order
        printNode(root);
    }

    public static void printNode(Node root) {
        if (root == null)
            System.out.println("Null");
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // Added missing root insertion

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null)
                queue.offer(tempNode.left);
            if (tempNode.right != null)
                queue.offer(tempNode.right);
        }
    }

    public static Node buildTree(int preorder[], int inorder[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        int preindex[] = {0};
        return constructBinaryTree(preorder, map, preindex, 0, inorder.length - 1); // Fixed right bound
    }

    public static Node constructBinaryTree(int preorder[], HashMap<Integer, Integer> map, int preindex[], int left, int right) {
        if (left > right)
            return null;

        int rootVal = preorder[preindex[0]];
        preindex[0]++;

        Node root = new Node(rootVal);
        int index = map.get(rootVal);

        root.left = constructBinaryTree(preorder, map, preindex, left, index - 1);
        root.right = constructBinaryTree(preorder, map, preindex, index + 1, right);

        return root;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
