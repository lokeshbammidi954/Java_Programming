package Java_Programming.LecturePatterns;
import java.util.*;
public class DaimondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N =sc.nextInt();

        for(int i=1;i<=N;i++){
            //spaces
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            //star's
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=N;i>=1;i--){
            //spaces
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            //star's
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

