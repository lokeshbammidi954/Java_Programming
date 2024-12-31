package Java_Programming.Recursion;

public class FibnocciSeries {
    public static void Fibnocci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(a);
        Fibnocci(b, c, n-1);

    }
    public static void main(String[] args) {
        Fibnocci(0, 1, 7);
    }
}