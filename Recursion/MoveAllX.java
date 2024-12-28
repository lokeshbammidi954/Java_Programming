package Java_Programming.Recursion;

public class MoveAllX {
    public static void MoveX(String S,int index,int count,String NewString){
        if(index == S.length()){
            for(int i=0;i<count;i++){
                NewString+='x';
            }
            System.out.println(NewString);
            return;
        }
        char currChar =S.charAt(index);
        if(currChar == 'x'){
            count++;
            MoveX(S,index+1,count,NewString);
        }
        else{
            NewString+=currChar;
            MoveX(S, index+1, count, NewString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveX(str, 0, 0, "");
    }
}
