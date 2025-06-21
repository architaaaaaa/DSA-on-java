package stack;

import java.util.*;

public class arraylistStack {
    public static class stack{
        static ArrayList<Integer> arr= new ArrayList<>();

        public static boolean isEmpty(){
            return arr.size()==0;
        }

        public static void push(int data){
            arr.add(data);
            return;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=arr.get(arr.size()-1); //last element
            arr.remove(arr.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr.get(arr.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s= new stack();
        s.push(2);
        s.push(5);
        s.push(9);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}