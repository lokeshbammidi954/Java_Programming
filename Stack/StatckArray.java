package Java_Programming.Stack;

import java.util.ArrayList;

public class StatckArray {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        // Push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack sc= new stack();
        sc.push(6);
        sc.push(17);
        sc.push(9);
        while (!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
