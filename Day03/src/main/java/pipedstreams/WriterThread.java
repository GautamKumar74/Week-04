package pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes()); // Write bytes into the pipe
            pos.close(); // Close stream after writing
        } catch (IOException e) {
            System.err.println("Writer error: " + e.getMessage());
        }
    }
}