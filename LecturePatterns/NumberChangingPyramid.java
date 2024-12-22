package Java_Programming.LecturePatterns;
import java.util.*;
public class NumberChangingPyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        int C=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(C+" ");
                C+=1;
            }
            System.out.println();
        }
    }
}