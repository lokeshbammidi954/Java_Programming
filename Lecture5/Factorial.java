package Java_Programming.Lecture5;
import java.util.*;
public class Factorial {
    public static int fact(int N){
        int factorial =1;
        for(int i=N;i>=1;i--){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N =sc.nextInt();
        System.out.println("Factorial of "+N+" is : "+fact(N));
    }
}
