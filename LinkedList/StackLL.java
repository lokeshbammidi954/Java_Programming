package Java_Programming.LinkedList;

public class StackLL {
    static class Node{
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            Next = null;
        }
    }
    static class Stack {
        public static Node head = null;
        public static void push(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.Next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.Next;
            return top.data;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }
    public static void main(String[] args) {
        Stack sl = new Stack();
        sl.push(5);
        sl.push(9);
        sl.push(7);
        while(!sl.isEmpty()) {
            System.out.println(sl.peek());
            sl.pop();
        }
        System.out.print(sl);
    }
}
