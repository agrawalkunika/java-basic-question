//Write a Java program to convert temperature from Celsius to Fahrenheit.
import java.util.Scanner;
public class Q8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius to convert in fahrenheit");
        double c = sc.nextDouble();
        double F = (c*9/5) +32;
        System.out.println(c + "°C = " + F + "°F");

        
    }
}
