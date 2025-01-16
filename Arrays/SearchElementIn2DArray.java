package Java_Programming.Arrays;
import java.util.*;
public class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns : ");
        int Columns = sc.nextInt();
        int number[][] = new int[row][Columns];
        //reading elements
        for(int i=0;i<row;i++){
            for(int j=0;j<Columns;j++){
                number[i][j] = sc.nextInt(); 
            }
        }
        System.out.print("Enter The Element To search in array : ");
        int X = sc.nextInt();
        //featching element in array.
        for(int i=0;i<row;i++){
            for(int j=0;j<Columns;j++){
                if (number[i][j] == X){
                    System.out.println(X+" Found at the index "+(i+","+j));
                }
            }
            System.out.println();
        }
        System.out.println(X+"Not found in the array");
    }
}
