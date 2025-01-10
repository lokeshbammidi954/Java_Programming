package Java_Programming.Stack;
import java.util.*;
public class StackCollectionFrameWork {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(6);
        s.push(17);
        s.push(9);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
