package Java_Programming.Recursion;

public class FactorialOFN {
    public static void Fact(int n,int fact){
        if(n == 0 || n==1 ) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        Fact(n-1, fact);
    }
    public static void main(String args[]) {
        Fact(5, 1);
    }
}
