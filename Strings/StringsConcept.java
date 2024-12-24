package Java_Programming.Strings;
import java.util.*;
public class StringsConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the String : ");
        //String name = sc.nextLine();
        //System.out.println("my name is : "+name);

        // CONCATINATION
/*      System.out.print("Enter the First Name : ");
        String First_Name = sc.nextLine();
        System.out.print("Enter the Lat Name : ");
        String Last_Name = sc.nextLine();
        System.out.println("My Name is : "+First_Name+" "+Last_Name); 
*/

        //LENGTH OF STRING
/* 
        System.out.print("Enter the First Name : ");
        String First_Name = sc.nextLine();
        System.out.print("Enter the Lat Name : ");
        String Last_Name = sc.nextLine();
        String Full_Name = First_Name+" "+Last_Name;
        System.out.println("My Name "+Full_Name+" and Length is : "+Full_Name.length());
*/
        // Characters of a string
/*      System.out.print("Enter the First Name : ");
        String First_Name = sc.nextLine();
        System.out.print("Enter the Lat Name : ");
        String Last_Name = sc.nextLine();
        String Full_Name = First_Name+" "+Last_Name;
        for(int i=0;i<Full_Name.length();i++){
            System.out.println(Full_Name.charAt(i));
*/
        //Substring
/*      System.out.print("Enter the First Name : ");
        String First_Name = sc.nextLine();
        System.out.print("Enter the Lat Name : ");
        String Last_Name = sc.nextLine();
        String Full_Name = First_Name+" "+Last_Name;
        System.out.println(Full_Name.substring(8));
*/
        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        //ToString Method of String class
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str.length());
    }
}
