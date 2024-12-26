package Java_Programming.Recursion;

public class PrintxPownLogn {
    public static int powerlogn(int x,int n){
        if (x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return powerlogn(x, n/2) * powerlogn(x, n/2);
        }
        else{
            return x* powerlogn(x, n/2) *powerlogn(x, n/2);
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int xn =powerlogn(x,n);
        System.out.println(xn);
    }
}
