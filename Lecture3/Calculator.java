
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
