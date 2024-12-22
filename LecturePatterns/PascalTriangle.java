package Java_Programming.LecturePatterns;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Value : ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N-i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}
