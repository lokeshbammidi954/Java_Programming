
/* Find the maximum & minimum number in an array of integers. 
[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
*/
package Java_Programming.Arrays;
import java.util.*;
public class MinmaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of The Array : ");
        int size = sc.nextInt();
        System.out.println("Enter The data to Array : ");
        int number[] = new int[size]; 

        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i] < min){
                min = number[i];
            }
            if(number[i] > max){
                max = number[i];
            }
        }
        System.out.println("Minimum of The Array : "+min);
        System.out.println("Maximum of The Array : "+max);
    }
}
