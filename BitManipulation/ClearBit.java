package Java_Programming.BitManipulation;
public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int Bitmask = 1<<pos;
        int newBitmask = ~(Bitmask);
        int newnumber = (newBitmask & n);
        System.out.println(newnumber);
    }
}
