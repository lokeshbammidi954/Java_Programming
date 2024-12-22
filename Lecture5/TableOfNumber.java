package Java_Programming.Lecture5;
import java.util.*;
public class TableOfNumber {
    public static void Table(int N){
        for(int i=1;i<=10;i++){
            System.out.println(N+"*"+i+"="+(N*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N Value : ");
        int N = sc.nextInt();
        Table(N);
    }
}
