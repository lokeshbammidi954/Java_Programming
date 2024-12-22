package Java_Programming.Lecture4;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false; 
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}
