package Java_Programming.Lecture5;
import java.util.*;
public class PrimeNumber {
    public static void isPrime(int N){
        for(int i=2;i<=N;i++){
            if (N%i == 0){
                System.out.println(N+" Is not prime");
                return;
            }
            else{
                System.out.println(N+" Is Prime");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        isPrime(N);
    }
}
