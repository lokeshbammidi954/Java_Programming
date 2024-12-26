package Java_Programming.Recursion;

public class PrintNumbersReverseOrder {
    public static void PrintNumber(int N){
        if (N==0){
            return;
        }
        System.out.println(N);
        PrintNumber(N-1);
    }
    public static void main(String[] args) {
        int N = 5;
        PrintNumber(N); 
    }
}
