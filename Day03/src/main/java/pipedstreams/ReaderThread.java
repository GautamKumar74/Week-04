package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = pis.read()) != -1) { // Read byte by byte
                System.out.print((char) data);
            }
            pis.close(); // Close stream after reading
        } catch (IOException e) {
            System.err.println("Reader error: " + e.getMessage());
        }
    }
}
