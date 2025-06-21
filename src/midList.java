import java.util.*;
public class midList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(10);

        int mid= list.size()/2;

        for(int i=mid; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
