package hashing;
import java.util.Iterator;
import java.util.HashSet;
public class basicOfSets {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        System.out.println(set); //no duplicates

        set.remove(1);
        System.out.println(set);

        if(set.contains(2)){
            System.out.println("contains the element 2");
        }
        if(!set.contains(6)){
            System.out.println("donot contains 6");
        }

        System.out.println("the size of out set is: "+set.size());

        Iterator it= set.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
