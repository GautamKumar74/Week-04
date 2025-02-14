package serializationsaveandretrieveanobject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSerialization {
    private static final String FILE_NAME = "src/main/java/serializationsaveandretrieveanobject/employees.dat";

    // Method to serialize employee list
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.err.println("Error saving employees: " + e.getMessage());
        }
    }

    // Method to deserialize employee list
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>(); // Return empty list if file doesn't exist
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        // Adding employees manually
        employees.add(new Employee(101, "Alice", "IT", 60000));
        employees.add(new Employee(102, "Bob", "HR", 55000));
        employees.add(new Employee(103, "Charlie", "Finance", 65000));

        // Serialize employees
        saveEmployees(employees);

        // Deserialize employees
        List<Employee> retrievedEmployees = loadEmployees();
        System.out.println("\nRetrieved Employees:");
        for (Employee emp : retrievedEmployees) {
            emp.display();
        }

        scanner.close();
    }
}
