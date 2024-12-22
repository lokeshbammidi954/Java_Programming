package Java_Programming.PracticeProblems;
import java.util.*;
public class GreaterOfTwo {
    public static void GraterThanTwo(int N,int M){
        if (N>M){
            System.out.println(N+" is The Bigger");
        }
        else{
            System.out.println(M+" is The Bigger");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N =sc.nextInt();
        System.out.print("Enter The M Value : ");
        int M =sc.nextInt();
        GraterThanTwo(N,M);
    }
}
