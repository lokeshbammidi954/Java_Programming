package Java_Programming.Queue;

public class QueueArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        queue(int n){
            this.size = n;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
    //enque
        public static void Add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
            }
            rear++;
            arr[rear] = data;
        }
    //deque
        public static int Remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }
    //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
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
