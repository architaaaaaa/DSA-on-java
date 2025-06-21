package arraylist;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);  //add elements
        list.add(5);
        list.add(4);
        list.add(2);

        System.out.println(list);

        for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+" "); //size() and get();
        }
        System.out.println();

        list.set(0,4); //modify elements
        System.out.println(list);

        list.remove(3); //delete elements
        System.out.println(list);

        Collections.sort(list); //sorting elements
        System.out.println(list);
    }
}
