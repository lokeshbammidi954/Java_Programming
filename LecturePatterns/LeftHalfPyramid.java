package Java_Programming.LecturePatterns;
import java.util.*;
public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}