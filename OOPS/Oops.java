package Java_Programming.OOPS;
class Pen{
    String color;
    String Type;

    public void Write(){
        System.out.println("Writing the something");
    }
    public void pencolor(){
        System.out.println(this.color);
    }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "Red";
        pen.Type = "Gel";
        pen.Write();
        Pen pen1 = new Pen();
        pen1.color = "Brown";
        pen1.Type = "Ballpoint";
        pen.pencolor();
        pen1.pencolor();
    }
}
