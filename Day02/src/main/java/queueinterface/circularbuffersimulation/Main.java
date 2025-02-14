package queueinterface.circularbuffersimulation;

// Main class to test circular buffer
public class Main {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // Output: Buffer: 1 2 3

        cb.insert(4); // Overwrites 1
        cb.display(); // Output: Buffer: 2 3 4

        cb.remove();  // Removes 2
        cb.display(); // Output: Buffer: 3 4

        cb.insert(5);
        cb.insert(6); // Overwrites 3
        cb.display(); // Output: Buffer: 4 5 6
    }
}