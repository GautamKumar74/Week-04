package readandwriteatextfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String sourceFile= "src/main/java/readandwriteatextfile/source.txt";
        String destinationFile= "src/main/java/readandwriteatextfile/destination.txt";

        File file= new File(sourceFile);
        if(!file.exists()){
            System.out.println("Source file does not exist.");
            return;
        }

        try(FileInputStream fis= new FileInputStream(sourceFile);
            FileOutputStream fos= new FileOutputStream(destinationFile)){
            int byteData;
            while((byteData= fis.read()) != -1){
                fos.write(byteData);
            }

            System.out.println("File copied successfully to " + destinationFile);
        }
        catch (IOException e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
