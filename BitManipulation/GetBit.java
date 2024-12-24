package Java_Programming.BitManipulation;
public class GetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int Bitmask = 1 << pos;

        if ((Bitmask & n) == 0){
            System.out.println("bit wise zero");
        }
        else{
            System.out.println("Bit wise one ");
        }
    }
    
}
