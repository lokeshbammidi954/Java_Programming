package Java_Programming.Queue;

public class LinkedlistQueue {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null; 
        }
    //Enque
        public static void Add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode; 
        }
    //deque
        public static int Remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
           //single node
           if(head == tail) {
               tail = null;
           }
           head = head.next;
           return front;

        }
    //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }
}
