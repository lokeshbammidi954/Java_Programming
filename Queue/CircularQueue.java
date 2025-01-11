package Java_Programming.Queue;

public class CircularQueue {
    static class queue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;
        queue(int n){
            this.size = n;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

    //Enque
        public static void Add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
    //deque
        public static int Remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front ){
                front = rear =-1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }
    //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        System.out.println("Removed 1st Element "+ q.Remove());
        q.Add(6);
        System.out.println("Removed 2nd Element "+ q.Remove());
        q.Add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }
}
