package Java_Programming.Recursion;

public class PermutationOfString {
    public static void PermutationOfStr(String S,String Permutation){
        if(S.length()==0){
            System.out.println(Permutation);
            return;
        }
        for(int i=0;i<S.length();i++){
            char currChar = S.charAt(i);
            String newStr = S.substring(0,i)+S.substring(i+1);
            PermutationOfStr(newStr, Permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String S = "abc";
        PermutationOfStr(S, "");
    }
}
