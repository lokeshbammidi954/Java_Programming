package Java_Programming.PracticeProblems;
import java.util.*;
public class CircumferenceOfaCircle {
    public static int Circle(int Radius){
        int circum = 2*(22/7)*Radius;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Value : ");
        int Radius =sc.nextInt();
        int circum = Circle(Radius);
        System.out.println(circum);
    }
}
