package Binary_Trees;
import java.util.*;

public class kthLevelSum{
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class LevelSum {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static int sumAtKthLevel(Node root, int k) {
            if (root == null ) {
                return 0;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int level = 1;
            int sum = 0;

            while (!queue.isEmpty()) {
                int nodesAtCurrentLevel = queue.size();
                for (int i = 0; i < nodesAtCurrentLevel; i++) {
                    Node currNode = queue.poll();
                    if (level == k) {
                        sum += currNode.data;
                    }
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
                if (level == k) {
                    break; // Stop after processing the k-th level
                }
                level++;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        LevelSum tree = new LevelSum();
        Node root = tree.buildTree(nodes);

        int k = 2; // Example: Sum nodes at level 2 (0-based index)
        int sum = tree.sumAtKthLevel(root, k);
        System.out.println("Sum of nodes at level " + k + ": " + sum);
    }
}