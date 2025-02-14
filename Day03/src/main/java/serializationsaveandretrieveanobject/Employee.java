package serializationsaveandretrieveanobject;

import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures version control in serialization
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display Employee Details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
    }
}
