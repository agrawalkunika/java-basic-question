// Find the Average of Three Numbers
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a+b+c)/3;
        System.err.println(result);

    }
}
