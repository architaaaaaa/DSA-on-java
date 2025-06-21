package hashing;
import java.util.*;
public class intersectionArray {
    public static int PrintIntersection(int arr1[], int arr2[]){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        System.out.println(PrintIntersection(arr1, arr2));
    }
}
