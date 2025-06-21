package BinarySearchTree;

public class DeleteNode {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node InsertValues(Node root, int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value<root.data){
            root.left= InsertValues(root.left,value);
        }
        if(value>root.data){
            root.right=InsertValues(root.right,value);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static Node deleteNode(Node root, int val){
        if(root==null){
            return null;
        }
        if(val<root.data){
            root.left=deleteNode(root.left,val);
        }else if(val>root.data){
            root.right=deleteNode(root.right,val);
        }else{//val==root.data
            //case 1
            if(root.left==null && root.right==null){
                return null;

            }
            //case 2
            else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case 3
            Node IS= InorderSuccessor(root);
            root.data=IS.data;
            root.right=deleteNode(root.right,IS.data);
        }
        return root;
    }

    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root= null;

        for(int i=0; i<values.length;i++){
            root= InsertValues(root,values[i]);
        }
        inorder(root);
        System.out.println();

        deleteNode(root,4);
        inorder(root);
    }
}
