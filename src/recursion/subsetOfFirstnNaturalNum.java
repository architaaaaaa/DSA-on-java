package recursion;
import java.util.*;
public class subsetOfFirstnNaturalNum {
//    public static void printSubsetList(ArrayList<Integer> subset){
//        for(int i=0; i<subset.size();i++){
//            System.out.print(subset.get(i)+" ");
//        }
//        System.out.println();
//    }

    public static void printSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
//            printSubsetList(subset);
            return;
        }
        subset.add(n);//to add
        printSubset(n-1, subset);

        subset.remove(subset.size()-1);// not to add on the set
        printSubset(n-1, subset);

    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset= new ArrayList<>();
        printSubset(n,subset);

    }
}
