package Java_Programming.Arrays;
import java.util.*;
public class FIndValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter The Numbers : ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enetr The Element to search in Array : ");
        int X =sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if (numbers[i] == X){
                System.out.println("X found at position "+i);
                return;
            }
        }
    }
}
