package linkedlist;
import java.util.*;
public class StringList {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("a"); //add element first
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.addLast("list");//add element lase
        list.add("!"); //adds at last index
        System.out.println(list);

        list.add(3,"good"); //adds at middle
        System.out.println(list);

        for(int i=0; i<list.size();i++){   //for getting the list
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");

        list.removeFirst(); //remove first element
        list.removeLast(); //remove last element
        System.out.println(list);
        list.remove(1); //remove at an index
        System.out.println(list);

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");

        list.reversed();
        System.out.println(list);
    }

}
