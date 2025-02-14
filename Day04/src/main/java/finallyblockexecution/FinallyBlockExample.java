package finallyblockexecution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter valid numbers");
        } finally {
            System.out.println("Operation completed.");
            sc.close();
        }
    }
}
