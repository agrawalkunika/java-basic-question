// Write a Java program that converts a double value to an int and displays both values.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a double value
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Type casting from double to int
        int intValue = (int) doubleValue;

        // Display both values
        System.out.println("\nDouble value: " + doubleValue);
        System.out.println("Integer value after type casting: " + intValue);

        sc.close();
    }
}

