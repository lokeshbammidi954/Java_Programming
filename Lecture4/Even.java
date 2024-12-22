/*Print all even numbers till n.
 */
package Java_Programming.Lecture4;
import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
