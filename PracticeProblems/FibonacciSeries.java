package Java_Programming.PracticeProblems;
public class FibonacciSeries {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int f;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=1;i<=10;i++){
            f=f1+f2;
            System.out.println(f+" ");
            f1=f2;
            f2=f;
        }
    }
    
}
