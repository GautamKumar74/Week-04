package checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName= "data.txt";

        try{
            FileReader fileReader= new FileReader(fileName);
            BufferedReader bufferedReader= new BufferedReader(fileReader);

            String line;
            while ((line= bufferedReader.readLine()) !=null ){
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("An error occurred while reading the file");
        }
    }
}
