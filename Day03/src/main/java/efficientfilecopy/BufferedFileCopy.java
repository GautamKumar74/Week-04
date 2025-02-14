package efficientfilecopy;

import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE= 4096;

    public static void main(String[] args) {
        String sourceFile = "src/main/java/efficientfilecopy/file_100MB.txt";
        String destFileBuffered = "src/main/java/efficientfilecopy/copy_buffered.txt";
        String destFileUnbuffered = "src/main/java/efficientfilecopy/copy_unbuffered.txt";

        // Measure time for buffered copy
        long startBuffered = System.nanoTime();
        copyWithBufferedStreams(sourceFile, destFileBuffered);
        long endBuffered = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endBuffered - startBuffered) / 1_000_000 + " ms");

        // Measure time for unbuffered copy
        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStreams(sourceFile, destFileUnbuffered);
        long endUnbuffered = System.nanoTime();
        System.out.println("Unbuffered Streams Time: " + (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");
    }

    private static void copyWithBufferedStreams(String source, String destination){
        try(BufferedInputStream bis= new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(destination))){

            byte[] buffer= new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer))!=-1){
                bos.write(buffer,0,bytesRead);
            }
            System.out.println("Buffered copy completed.");
        }

        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void copyWithUnbufferedStreams(String source, String destination){
        try (FileInputStream fis= new FileInputStream(source);
        FileOutputStream fos= new FileOutputStream(destination)){

            int byteData;
            while((byteData=fis.read())!=-1){
                fos.write(byteData);
            }
            System.out.println("Unbuffered copy completed.");
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
