package BinarySearchTree;

import java.util.ArrayList;

public class buildTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node buildTree(Node root, int value){
        if(root==null){
            root= new Node(value);
            return root;
        }
        if(value<root.data){
            root.left= buildTree(root.left, value);
        }else{
            root.right= buildTree(root.right,value);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean searchNode(Node root, int key){
        if(root==null){
            return false;
        }
        if(key<root.data){
            return searchNode(root.left,key);
        }
        else if(key==root.data){
            return true;
        }else{
            return searchNode(root.right,key);
        }
    }
    public static void findingNode(Node root, int x, int y){            //print from x to y range!!
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            findingNode(root.left,x,y);
            System.out.print(root.data+" ");
            findingNode(root.right,x,y);
        }
        else if(root.data>=y){
            findingNode(root.left,x,y);
        }
        else{
            findingNode(root.right,x,y);
        }
    }

    public static void printLeaf(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    public static void root2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        //leaf node
        if(root.left==null && root.right==null){
            printLeaf(path);
        }else{ //non leaf node
            root2Leaf(root.left,path);
            root2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root= buildTree(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root2Leaf(root,new ArrayList<>());
    }
}
