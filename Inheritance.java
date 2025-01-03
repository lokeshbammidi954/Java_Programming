package Java_Programming;
class Animal{
    int eyes = 2;
}
class Horse extends Animal{
    public void Printinfo(){
        System.out.println("Horse has 4 legs");
        System.out.println("Horse has "+this.eyes+" eyes");
    }
}
class Horsechild extends Horse{
    public void PrintInfo(){
        System.out.println("Horse has 4 legs");
        System.out.println("Horse has "+this.eyes+" eyes");
        System.out.println("Child from horse ");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.Printinfo();
        Horsechild c = new Horsechild();
        c.PrintInfo();
    }
}
