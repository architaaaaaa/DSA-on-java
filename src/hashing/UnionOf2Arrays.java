package hashing;
import java.util.*;
public class UnionOf2Arrays {
    public static int Union(int arr1[], int arr2[]){
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr1.length;i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]));
            }
        }
        for(int j=0;j<arr2.length;j++){
                if(!map.containsKey(arr2[j])) {
                    map.put(arr2[j], map.get(arr2[j]));
                }
        }

            for(Integer key:map.keySet()){
                System.out.print(key+" ");
            }
        System.out.println();
            return map.size();
    }

    public static int PrintUnion(int arr1[], int arr2[]){
        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        System.out.println(Union(arr1,arr2)); //using map
        System.out.println(PrintUnion(arr1,arr2)); //using set
    }
}
