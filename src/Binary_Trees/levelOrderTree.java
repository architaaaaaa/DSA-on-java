package Binary_Trees;
import java.sql.SQLOutput;
import java.util.*;
public class levelOrderTree {
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

    public static class levelOrderTraversal {
        static int index = -1;

        public static Node TreeBuilder(int nodes[]) {
            index++;
            if(nodes[index] == -1) {
                return null;
            }
            Node newNode= new Node(nodes[index]);
            newNode.left=TreeBuilder(nodes);
            newNode.right= TreeBuilder(nodes);

            return newNode;
        }

        public static void levelOrder(Node root){
            if(root==null) return;
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public int countNodesNum(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes= countNodesNum(root.left);
            int rightNodes= countNodesNum(root.right);

            return leftNodes+rightNodes+1;
        }

        public static int sumNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum= sumNodes(root.left);
            int rightsum=sumNodes(root.right);

            return leftSum+rightsum+root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1, -1, 3, -1, 6, -1, -1};
        levelOrderTraversal tree= new levelOrderTraversal();
        Node root= tree.TreeBuilder(nodes);

        System.out.println("the root is:"+ root.data);

        System.out.println(tree.countNodesNum(root));
        System.out.println(tree.sumNodes(root));
    }
}
