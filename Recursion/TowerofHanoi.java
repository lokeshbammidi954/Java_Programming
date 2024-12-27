package Java_Programming.Recursion;

public class TowerofHanoi {
    public static void Tower(int n,String S,String H,String D){
        if(n==1){
            System.out.println("Transfered The "+n+" from "+S+" To "+D);
            return;
        }
        Tower(n-1, S, D, H);
        System.out.println("Transfered The "+n+" from "+S+" To "+D);
        Tower(n-1, H, S, D);
    }
    public static void main(String[] args) {
        int n = 4;
        Tower(n,"S","H","D");
    }
}
