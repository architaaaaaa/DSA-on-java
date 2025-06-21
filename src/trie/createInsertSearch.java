package trie;

public class createInsertSearch {
    static class Node{
        Node[] children; //26 letters- a to z
        boolean eow; //end of words

        Node(){
            children= new Node[26];
            eow=true;
        }
    }
    static Node root= new Node();

    public static void insert(String word){

    }
}
