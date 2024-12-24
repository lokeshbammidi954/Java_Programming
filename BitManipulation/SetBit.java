package Java_Programming.BitManipulation;
public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitwise = 1<<pos;
        int newBit = bitwise|n;
        System.out.println(newBit);
    }
}
