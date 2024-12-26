package Java_Programming.Recursion;

public class SumOfNnumbers {
    public static void SumOfN(int N,int sum){
        if(N == 0){
            System.out.println(sum);
            return;
        }
        sum += N;
        SumOfN(N-1,sum);
    }
    public static void main(String[] args) {
        int N = 10;
        int sum=0;
        SumOfN(N,sum);
    }
}
