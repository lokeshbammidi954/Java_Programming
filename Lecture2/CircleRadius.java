/*Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
 */
package Java_Programming.Lecture2;

public class CircleRadius {
    public static void main(String[] args) {
        float pi = 22/7;
        int radius = 5;
        float area = pi*(radius*radius);
        System.out.println(area);
    }
}
