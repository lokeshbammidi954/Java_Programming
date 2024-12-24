package Java_Programming.PracticeProblems;
import java.util.*;
public class GreatestCommonDivisor {
    public static int HCF(int A, int B){
        if(B==0){
            return A;
        }
        else{
            return HCF(B,A%B);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The A Value : ");
        int A = sc.nextInt();
        System.out.print(" Enter The B Value : ");
        int B = sc.nextInt();
        System.out.println("HCF of Two numbers is : "+HCF(A,B));
    }
}
