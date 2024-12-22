package Java_Programming.PracticeProblems;
import java.util.*;
public class Average {
    public static void AVG(int A,int B,int C){
        int sum = (A+B+C);
        float avg =(sum/3);
        System.out.println("Average of Three Numbers : "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A Value : ");
        int A =sc.nextInt();
        System.out.println("Enter The B Value : ");
        int B =sc.nextInt();
        System.out.println("Enter The C Value : ");
        int C =sc.nextInt();
        AVG(A,B,C);
    }
}
