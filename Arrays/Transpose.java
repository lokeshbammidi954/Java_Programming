package Java_Programming.Arrays;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The rows : ");
        int n = sc.nextInt();
        System.out.println("Enter The Columns : ");
        int m = sc.nextInt();
        System.out.println("Enter The Elemnts : ");
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");
        //To print transpose
        for(int j=0; j<m ;j++) {
            for(int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
