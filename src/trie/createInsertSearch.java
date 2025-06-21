package trie;

public class createInsertSearch {
    public static class Node{
        Node[] children; //26 letters- a to z
        boolean eow; //end of words

        Node(){
            children= new Node[26];
            for(int i=0; i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }

    static Node root= new Node();

    public static void insert(String word){
        Node curr= root;
        for(int i=0; i<word.length();i++){
            int index= word.charAt(i)-'a';

            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            if(i==word.length()-1){
                curr.children[index].eow=true;
            }
            curr=curr.children[index];
        }
    }

    public static boolean search(String key){
        Node curr=root;
        for(int i=0; i<key.length();i++){
            int index= key.charAt(i)-'a';

            Node node= curr.children[index];

            if(node==null){
                return false;
            }
            if(i==key.length()-1 && !node.eow){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[]={"there", "their", "a", "any", "ant"};
        for(int i=0; i< words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("a"));
        System.out.println(search("world"));
        System.out.println(search("focus"));
    }
}
