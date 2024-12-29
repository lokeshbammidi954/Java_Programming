package Java_Programming.BackTracking;
import java.util.*;
public class PrintPermutations {
    public static void Permutation(String S,String Per,int index){
        if(S.length() == 0){
            System.out.println(Per);
            return;
        }
        for(int i=0;i<S.length();i++){
            char currChar = S.charAt(i);
            String newStr = S.substring(0, i) + S.substring(i+1);
            Permutation(newStr, Per+currChar, index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String S = sc.nextLine();
        Permutation(S,"",0);
    }
}
