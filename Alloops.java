package Java_Programming;
class Pen{
    String Color;
    String Type;
    String Ink;
    public void PenInfo(){
        System.out.println(this.Color);
        System.out.println(this.Ink);
        System.out.println(this.Type);
    }
    Pen(){
        System.out.println("This The pen");
    }
    Pen(String Ink, String Type){
        System.out.println(Ink+" "+Type);
    }
}
public class Alloops {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.Color = "Red";
        p.Type = "Gel";
        p.Ink = "Blue";
        
    }
}
