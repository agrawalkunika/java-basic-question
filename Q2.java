// area of circle
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Give the radius of the circle");
        double r = sc.nextDouble();
        double Area = Math.PI*r*r;
        System.err.println(Area);
    }
}
