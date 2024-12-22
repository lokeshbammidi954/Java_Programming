package Java_Programming.PracticeProblems;
import java.util.*;
public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N Value : ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i=i+2){
            sum+=i;
        }
        System.out.println("Sum of all odd numbers from 1 to "+N+" is : "+sum);
    }
}
