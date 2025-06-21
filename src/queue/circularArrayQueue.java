package queue;

public class circularArrayQueue {
    public static class queue{
        public static int arr[];
        public static int n;
        public static int front=-1;
        public static int rear=-1;

        queue(int n){
            arr= new int[n];
            this.n=n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%n==front;
        }

        //enqueue- O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear= (rear+1)%n;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            int result= arr[front];
            if(front==rear){
                front=rear= -1;
            }else{
                front=(front+1)%n;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
