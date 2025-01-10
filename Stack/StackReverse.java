package Java_Programming.Stack;

import java.util.*;

public class StackReverse {
    public static void PushAtBottom(int data,Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data, s);
        s.push(top);
    }
    public static void Reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        PushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Reverse(s);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
