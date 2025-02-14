package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Enter the numerator: ");
            int numerator= sc.nextInt();

            System.out.println("Enter the denominator: ");
            int denominator= sc.nextInt();

            int result= numerator/denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values");
        }
        finally {
            sc.close();
        }
    }
}
