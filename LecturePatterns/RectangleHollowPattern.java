package Java_Programming.LecturePatterns;
import java.util.*;
public class RectangleHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The M Value : ");
        int M = sc.nextInt();
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if (i==0 || j==0 || i==M-1 || j==N-1){
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
}
