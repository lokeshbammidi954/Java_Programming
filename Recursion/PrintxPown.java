package Java_Programming.Recursion;

public class PrintxPown {
    public static int PowerOfN(int X,int N){
        if(X == 0) {
            return 0;
            }
        if(N == 0) {
            return 1;
            }
        int xn = X* PowerOfN(X, N-1);
        return xn;

    }
    public static void main(String[] args) {
        int X = 3;
        int N = 3;
        int ans = PowerOfN(X,N);
        System.out.println(ans);
    }
}
