package Binary_Trees;

public class heightTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right= null;
        }
    }
    public static class TreeNode{
        static int index=-1;
        public static Node BuildingTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode= new Node(nodes[index]);
            newNode.left=BuildingTree(nodes);
            newNode.right=BuildingTree(nodes);

            return newNode;
        }

        public static int heightTree(Node root){
            if(root==null){
                return 0;
            }
            int leftSubTree= heightTree(root.left);
            int rightSubTree= heightTree(root.right);

            return Math.max(leftSubTree,rightSubTree)+1;
        }

        public static int diameterTree(Node root){ //O(N^2)
            if(root==null) return 0;

            int diam1=diameterTree(root.left);
            int diam2= diameterTree(root.right);
            int diam3= heightTree(root.left)+ heightTree(root.right)+ 1;

            return Math.max(diam3, Math.max(diam1, diam2));
        }

        static class treeNode{
            int height;
            int dimater;

            treeNode(int height, int dimater){
                this.height=height;
                this.dimater=dimater;
            }
        }
        public static treeNode diameter2(Node root){
            if(root==null) {
                return new treeNode(0,0);
            }
            treeNode left= diameter2(root.left);
            treeNode right= diameter2(root.right);

            int myHeight= Math.max(left.height, right.height)+1;

            int diam1=left.height+right.height+1;
            int diam2= left.dimater;
            int diam3= right.dimater;

            int myDiameter= Math.max(diam1, Math.max(diam2, diam3));

            return new treeNode(myHeight, myDiameter);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1, -1, 3, -1, 6, -1, -1};
        TreeNode tree= new TreeNode();
        Node root= tree.BuildingTree(nodes);

        System.out.println(root.data);

        System.out.println(tree.heightTree(root));

        System.out.println(tree.diameterTree(root));

        System.out.println(tree.diameter2(root).dimater);
    }

}
