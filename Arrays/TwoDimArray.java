package Java_Programming.Arrays;
import java.util.*;
public class TwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter The Number of Columns : ");
        int Columns = sc.nextInt();
        System.out.println("Enter The Elements to 2D Array : ");
        int numbers[][] = new int[row][Columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<Columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<Columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
