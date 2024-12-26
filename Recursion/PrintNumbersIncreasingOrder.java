package Java_Programming.Recursion;

public class PrintNumbersIncreasingOrder {
    public static void PrintNumber(int N){
        if (N==6){
            return;
        }
        System.out.println(N);
        PrintNumber(N+1);
    }
    public static void main(String[] args) {
        int N=1;
        PrintNumber(N);
    }
}
