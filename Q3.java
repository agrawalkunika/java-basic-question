// Swap two number using + -
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
