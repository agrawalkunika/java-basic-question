//Write a Java program to evaluate and print the result of the following expression:
public class Q10{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 2;
        int result = a + b * c - (a % c);
        System.out.println("Expression: a + b * c - (a % c)");
        System.out.println("Result = " + result);
    }
}
