/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */
package Java_Programming.Lecture3;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value of B : ");
        int b = sc.nextInt();
        System.out.print("Enter The Operator : ");
        int operator = sc.nextInt();
        switch(operator){
            case 1 : 
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3 :
                System.out.println(a*b);
                break;
            case 4 :
                if(b==0){
                    System.out.println("Divison is not Possible");
                }
                else{
                System.out.println(a/b);
                break;
                }
            case 5 :
            if(b==0){
                System.out.println("Divison is not Possible");
            }
            else{
                System.out.println(a%b);
                break;
            }
            default:
                System.out.println("Arthmetic Operation not possible due to invalid inputs");
        }

    }
}
