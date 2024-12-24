package Java_Programming.Arrays;
import java.util.*;
public class AscDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of the Array : ");
        int size = sc.nextInt();
        System.out.println("Enter The Elements to Array : ");
        int number[] = new int[size];

        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
     
        for(int i=0; i<number.length-1; i++) { 
            if(number[i] > number[i+1]) { 
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("Array in Ascending Order");
        }
        else{
            System.out.println("Array in Decending Order");
        }
    }
}
