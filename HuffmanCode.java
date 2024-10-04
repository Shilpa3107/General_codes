import java.util.*;

public class HuffmanCode {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D'};
        int[] frequencies = {5, 9, 12, 13};

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for (int i = 0; i < chars.length; i++) {
            minHeap.add(new Node(chars[i], frequencies[i]));
        }

        Node root = buildHuffmanTree(minHeap);

        Map<Character, String> codes = new HashMap<>();
        encode(root, "", codes);

        System.out.println("Character\tCode\tFrequency");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + "\t" + codes.get(chars[i]) + "\t" + frequencies[i]);
        }

        int totalEncodedLength = calculateTotalEncodedLength(codes, frequencies, chars);
        System.out.println("Total encoded message length: " + totalEncodedLength);
    }

    public static Node buildHuffmanTree(PriorityQueue<Node> minHeap) {
        while (minHeap.size() > 1) {
            Node left = minHeap.poll();
            Node right = minHeap.poll();
            Node internalNode = new Node('\0', left.freq + right.freq);
            internalNode.left = left;
            internalNode.right = right;
            minHeap.add(internalNode);
        }
        return minHeap.poll();
    }

    public static void encode(Node root, String code, Map<Character, String> codes) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            codes.put(root.c, code);
            return;
        }
        encode(root.left, code + "0", codes);
        encode(root.right, code + "1", codes);
    }

    public static int calculateTotalEncodedLength(Map<Character, String> codes, int[] frequencies, char[] chars) {
        int totalEncodedLength = 0;
        for (int i = 0; i < frequencies.length; i++) {
            totalEncodedLength += frequencies[i] * codes.get(chars[i]).length();
        }
        return totalEncodedLength;
    }
}

class Node implements Comparable<Node> {
    char c;
    int freq;
    Node left, right;

    Node(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }

    @Override
    public int compareTo(Node other) {
        return this.freq - other.freq;
    }
}
