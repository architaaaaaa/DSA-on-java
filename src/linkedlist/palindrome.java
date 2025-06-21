package linkedlist;
import java.util.*;
public class palindrome {

    public static boolean isPalindrome(LinkedList<Integer> list, LinkedList<Integer> list1){
        return list.equals(list1);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("number of elements to add: ");
        int n=sc.nextInt();

        System.out.println("enter the elements: ");
        for(int i=0; i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("the linkedList: ");
        System.out.println(list);

        list1= list.reversed();
        System.out.println("the reversed list is: ");
        System.out.println(list1);

        if (isPalindrome(list,list1)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is NOT a palindrome.");
        }
    }
}































