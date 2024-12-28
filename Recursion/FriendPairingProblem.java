package Java_Programming.Recursion;
import java.util.*;
public class FriendPairingProblem {
    public static int Pairing(int n){
        if(n<=1){
            return 1;
        }
        int way1 = Pairing(n-1);
        int way2 = (n-1) * Pairing(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of People to invite  : ");
        int n = sc.nextInt();
        System.out.println(Pairing(n));
    }
}
