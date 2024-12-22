package Java_Programming.Lecture5;
import java.util.*;
public class Sum {
    public static void SUM(int N,int M){
        int Sum = N+M;
        System.out.println("Sum of Two Numbers : "+ Sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        System.out.print("Enter The M Value : ");
        int M = sc.nextInt();
        SUM(N,M);
    }
}
