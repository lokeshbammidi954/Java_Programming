package Java_Programming.Strings;
import java.util.*;
public class EmailString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Email ID : ");
        String Email = sc.nextLine();
        String Res="";
        for(int i=0;i<Email.length();i++){
            if(Email.charAt(i) == '@'){
                break;
            }
            else{
                Res +=Email.charAt(i);
            }
        }
        System.out.println(Res);
    }
}
