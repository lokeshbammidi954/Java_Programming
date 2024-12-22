package Java_Programming.Lecture4;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the i value : ");
        int i = sc.nextInt();
        while (i<=20){
            System.out.println(i);
            i+=1;
        }
    }
}
