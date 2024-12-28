package Java_Programming.Recursion;

public class SubSequence {
    public static void SubSequence(String S,String newString,int index){
        if(index == S.length()){
            System.out.println(newString);
            return;
        }
        char currChar = S.charAt(index);
        //to be
        SubSequence(S, newString+currChar, index+1);
        //not to be
        SubSequence(S, newString, index+1);

    }
    public static void main(String[] args) {
        String str="abc";
        SubSequence(str, "", 0);
    }
}
