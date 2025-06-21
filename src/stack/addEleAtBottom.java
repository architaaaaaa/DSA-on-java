package stack;

import java.util.Stack;

public class addEleAtBottom {
    public static void printStack(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        printStack(data,s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(2);
        s.push(5);
        s.push(9);

        printStack(4,s);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
