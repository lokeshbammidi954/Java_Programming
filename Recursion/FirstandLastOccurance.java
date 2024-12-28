package Java_Programming.Recursion;

public class FirstandLastOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void FirstandLastOcc(String S,int index, char element){
        if(index == S.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = S.charAt(index);
        if(currChar == element){
            if(first == -1){
                first =index;
            }
            else{
                last = index;
            }
        }
        FirstandLastOcc(S, index+1, element);

    }
    public static void main(String[] args) {
        String S="abaabhabbaaahabaahhfba";
        FirstandLastOcc(S,0,'a');
    }
}
