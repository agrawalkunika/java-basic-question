// Write a Java program to check whether a number is even or odd.
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is " + result + ".");
        sc.close();
    }
}

