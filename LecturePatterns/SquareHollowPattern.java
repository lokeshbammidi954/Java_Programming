package Java_Programming.LecturePatterns;
import java.util.*;
public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The M Value : ");
        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if (i==0 || j==0 || i== M-1 || j==M-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
