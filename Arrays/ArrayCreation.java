package Java_Programming.Arrays;
import java.util.*;
public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* Noraml initialization way - 1 */

        //int marks[] = new int[3];
        //marks[0] = 89;
        //marks[1] = 34;
        //marks[2] = 33;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        /* way 2 */
        //int marks[] ={28,36,89};
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        /* Way - 3 */
        System.out.print("Enter The Size of the array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
