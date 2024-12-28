/* Given a floor of size n x m and tiles of size 1 x m. The problem is to count the number of ways to tile the given floor using 1 x m tiles. A tile can either be placed horizontally or vertically.
Both n and m are positive integers and 2 < = m */
package Java_Programming.Recursion;
import java.util.*;
public class TailingProblem {
    public static int Tails(int n,int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //vertically 
        int vertical = Tails(n-m,m);
        //Horizontally
        int Horizontal = Tails(n-1,m);
        return vertical+Horizontal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter The Number of Columns : ");
        int Column = sc.nextInt();
        int total_tails = Tails(row,Column);
        System.out.println(total_tails);
    }
}
