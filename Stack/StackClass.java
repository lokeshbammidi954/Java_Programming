package Java_Programming.Stack;

public class StackClass {
    public static Node head;
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                next = null;
            }
        } 
        static class stack{
            public static boolean isEmpty(){
                return head == null;
        }
        
        public static void Push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack sc = new stack();
        sc.Push(6);
        sc.Push(9);
        sc.Push(10);
        while(head != null){
                    System.out.println(sc.Peek());
                    sc.Pop();
            }
    }
}
