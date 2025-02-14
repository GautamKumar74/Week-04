package readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        String fileName= "src/main/java/readuserinputfromconsole/user_info.txt";

        try (BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer= new FileWriter(fileName, true)){
            System.out.println("Enter your name: ");
            String name= reader.readLine();

            System.out.println("Enter your age: ");
            String age= reader.readLine();

            System.out.println("Enter your favorite programming language: ");
            String language= reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("-----------------------------\n"); // Separator for readability

            System.out.println("User information saved to " + fileName);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
