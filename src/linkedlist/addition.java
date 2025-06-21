package linkedlist;
class ll{
    Node head;
    int size;

    ll(){
        size=0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=next;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head== null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head== null){
            head= newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void addMid(int index, String data){
        if(index>size || index< 0){
            System.out.println("invalid");
            return;
        }
        size++;

        Node newNode= new Node(data);
        if(head==null || index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currNode= head;
        for(int i=0; i<size;i++){
            if(i==index){
                Node nextNode= currNode.next;
                currNode.next= newNode;
                newNode.next= nextNode;
                break;
            }
            currNode=currNode.next;
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode= head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public void printList(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
}

public class addition {
    public static void main(String[] args) {
        ll list= new ll();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addMid(2,"single");
        list.printList();

        System.out.println( list.getSize());
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println( list.getSize());

    }
}
