/* Take an array of names as input from the user and print them on the screen.
 */

package Java_Programming.Arrays;
import java.util.*;
public class ArrayOfNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        String names[] = new String[size];

        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }

        for(int i=0;i<names.length;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
    }
}
