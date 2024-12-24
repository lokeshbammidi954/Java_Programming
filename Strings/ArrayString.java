package Java_Programming.Strings;
import java.util.*;
public class ArrayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        System.out.println("Enter The Elements : ");
        String Name[] = new String[size];
        int total=0;
        for(int i=0;i<Name.length;i++){
            Name[i] = sc.next();
            total+=Name[i].length();
        }

        System.out.println(total);
    }
}
