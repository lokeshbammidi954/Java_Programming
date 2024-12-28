package Java_Programming.Recursion;

public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    public static void RemoveDuplicates(String S,String newString,int index){
        if(index ==S.length()){
            System.out.println(newString);
            return;
        }
        char currChar = S.charAt(index);
        if(map[currChar-'a'] == true ){
            RemoveDuplicates(S, newString, index+1);
        }
        else{
            newString +=currChar;
            map[currChar-'a'] = true;
            RemoveDuplicates(S, newString, index+1);
        }
    }
    public static void main(String[] args) {
        String Str = "abbcda";
        RemoveDuplicates(Str, "", 0);
    }
}
