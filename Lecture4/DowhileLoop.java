package Java_Programming.Lecture4;
import java.util.*;
public class DowhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the i Value : ");
        int i = sc.nextInt();
        do{
            System.out.println(i);
            i+=1;
        }while(i<=20);
    }
}
