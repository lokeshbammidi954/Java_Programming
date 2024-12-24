/*
Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */

package Java_Programming.Strings;
import java.util.*;
public class Charchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name : ");
        String name = sc.nextLine(); 
        String Res = "";
        for(int i=0;i<name.length();i++){
            if (name.charAt(i) == 'e'){
                Res+='i';
            }
            else{
                Res+=name.charAt(i);
            }
        }
        System.out.println(Res);
    }
}
