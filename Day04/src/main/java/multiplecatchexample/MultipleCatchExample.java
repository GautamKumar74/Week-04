package multiplecatchexample;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Integer[] numbers= {10,20,30,40,50};

        System.out.println("Enter an index: ");
        int index= sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized");
        }
        finally {
            sc.close();
        }
    }
}
