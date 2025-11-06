// Write a Java program that takes a character as input and prints its ASCII value.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
