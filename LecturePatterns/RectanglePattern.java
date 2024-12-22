package Java_Programming.LecturePatterns;
import java.util.*;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The M Value : ");
        int M = sc.nextInt();
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
