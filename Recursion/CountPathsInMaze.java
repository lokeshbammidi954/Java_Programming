package Java_Programming.Recursion;
import java.util.*;
public class CountPathsInMaze {
    public static int Paths(int i,int j,int rows,int Columns){
        if(i == rows || j== Columns){
            return 0;
        }
        if( i == rows-1 && j == Columns-1 ){
            return 1;
        }
        //Down Paths
        int downPaths = Paths(i+1, j, rows, Columns);
        //Right Paths
        int rightPaths = Paths(i, j+1, rows, Columns);

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter The Number of Columns : ");
        int Columns = sc.nextInt();
        int Total_Paths = Paths(0,0,rows,Columns);
        System.out.println(Total_Paths);
    }
}
