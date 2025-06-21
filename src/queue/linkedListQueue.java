package queue;

public class linkedListQueue {
    public static class Node{
        int data;
        Node next;

        Node( int data){
           this.data=data;
           this.next=null;
        }
    }

    public static class queue{
        static Node head= null;
        static Node tail= null;

        public static boolean isEmpty(){
            return head== null && tail== null;
        }

        public static void add(int data){
            Node newNode= new Node(data);

            //adding first element
            if(tail==null){
                tail=head=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=head.data;
            //single element
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q= new queue();
        q.add(1);
        q.add(3);
        q.add(6);
        q.add(7);
        q.add(12);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}