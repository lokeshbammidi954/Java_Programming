package Java_Programming.Lecture5;
import java.util.*;
public class EvenOrNot {
    public static void evenorodd(int N){
        if(N%2 == 0){
            System.out.println(N+" Is Even");
        }
        else{
            System.out.println(N+" Is NOt Even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        evenorodd(N);
    }
}
