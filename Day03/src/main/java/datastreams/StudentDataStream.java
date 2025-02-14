package datastreams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "src/main/java/datastreams/students.dat"; // Binary file to store data

        // Writing student details to a binary file
        writeStudentData(fileName);

        // Reading and displaying student details from the file
        readStudentData(fileName);
    }

    // Method to write student details using DataOutputStream
    public static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing student details
            dos.writeInt(101);               // Roll Number
            dos.writeUTF("Alice Johnson");   // Name
            dos.writeDouble(3.8);            // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob Smith");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("Charlie Brown");
            dos.writeDouble(3.9);

            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read student details using DataInputStream
    public static void readStudentData(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nRetrieving Student Details:");

            while (dis.available() > 0) { // Read till end of file
                int rollNo = dis.readInt();       // Read roll number
                String name = dis.readUTF();      // Read name
                double gpa = dis.readDouble();    // Read GPA

                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
