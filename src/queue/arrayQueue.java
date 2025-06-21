package queue;

public class arrayQueue {
    public static class queue{
        public static int arr[];
        public static int n; //size
        public static int rear=-1; //front is always 0

        queue(int n){
            arr=new int[n];
            this.n=n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void enqueue(int data){
            if(rear==n-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(3);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(9);

        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.dequeue();
        }

    }
}