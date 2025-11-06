//Write a program to calculate Simple Interest.
import java.util.Scanner;
public class Q7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of principal ");
        double P = sc.nextDouble();
        System.out.println("Enter the amount of Time in year ");
        double T = sc.nextDouble();
        System.out.println("Enter the amount of rate in percent ");
        double R = sc.nextDouble();
        double Simple_interest = (P*R*T)/100;
        System.err.println("Simple interest is " +Simple_interest);   
    }
}
