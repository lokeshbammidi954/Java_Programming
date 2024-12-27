package Java_Programming.Recursion;

public class Printreverse {
    public static void PrintRev(String S,int n){
        if(n==0){
            System.out.println(S.charAt(n));
            return;
        }
        System.out.println(S.charAt(n));
        PrintRev(S, n-1);
    }
    public static void main(String[] args) {
        String S = "Lokesh";
        PrintRev(S,S.length()-1);
    }
}
