package stack;
import java.util.*;
public class shortcut {
    class stack{
        int data;
        stack(){
            this.data=data;
        }
    }
    static Stack<Integer> s=new Stack<>();
    public  static boolean isEmpty(){
        return s==null;
    }
    public static void main(String[] args) {
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);

        System.out.println("the stack elements are: ");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println(s.reversed());



    }
}
