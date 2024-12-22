package Java_Programming.Lecture5;
import java.util.*;
public class Product {
    public static int Product(int N,int M){
        int prod = N*M;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        System.out.print("Enter The M Value : ");
        int M = sc.nextInt();
        int prod = Product(N,M);
        System.out.println("Product of Two Numbers : "+prod);
    }
}
