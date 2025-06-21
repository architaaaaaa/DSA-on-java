package linkedlist;

import java.util.LinkedList;

public class shortcutAdd {
    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        ll.add(2,5);
        System.out.println(ll);
        System.out.println(ll.size());
        for(int i=0;i<ll.size();i++){
//            if(ll.get(i)==5){
//                System.out.println(i);
//            }
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("null");
    }
}