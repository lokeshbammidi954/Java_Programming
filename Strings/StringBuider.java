package Java_Programming.Strings;

public class StringBuider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(0,'T');
        System.out.println(sb);
        sb.append("Stark");
        System.out.println(sb+" "+sb.length());
    }
}
