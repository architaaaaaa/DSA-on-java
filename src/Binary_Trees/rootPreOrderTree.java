package Binary_Trees;

public class rootPreOrderTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;
        }
    }

    public static class preorderTree{
        static int index= -1;
        public static Node BuildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left= BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }

        public static void preorderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);

        }

        public static void inorderTraversal(Node root){
            if(root==null){
                return;
            }

            preorderTraversal(root.left);
            System.out.print(root.data+" ");
            preorderTraversal(root.right);

        }

        public static void postorderTraversal(Node root){
            if(root==null){
                return;
            }

            preorderTraversal(root.left);
            preorderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1, -1, 3, -1, 6, -1, -1};
        preorderTree tree= new preorderTree();

        Node root= tree.BuildTree(nodes);

        System.out.println("the root node is: "+ root.data);

        System.out.println("preorder traversal");
        tree.preorderTraversal(root);
        System.out.println();
        System.out.println("inorder traversal");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println("postorder traversal");
        tree.postorderTraversal(root);
    }
}
