package Java_Programming.PracticeProblems;
import java.util.*;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        if (N>=18){
            System.out.println(N+" Eligible to Vote ");
        }
        else{
            System.out.println(N+" Not Eligible to Vote ");
        }
    }
}
