package Java_Programming.LecturePatterns;
import java.util.*;
public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        for(int i=N;i>=1;i--){
            for(int j=0;j<N-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
