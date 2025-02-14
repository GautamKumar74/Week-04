package bytearraystream;

import java.io.*;

public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/bytearraystream/input.jpg";    // Original image file
        String outputImagePath = "src/main/java/bytearraystream/output.jpg";  // Output image file

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Convert byte array back to image file
            convertByteArrayToImage(imageBytes, outputImagePath);

            System.out.println("Image conversion successful! Check the output file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to convert image file to byte array
    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4KB buffer size
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray(); // Return image data as byte array
        }
    }

    // Method to convert byte array back to image file
    public static void convertByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // 4KB buffer size
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
