package queueinterface.circularbuffersimulation;

public class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            front = (front + 1) % capacity;
        } else {
            size++;
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
    }

    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Buffer is empty!");
        }
        int removedValue = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    // Get current buffer elements
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();

    }


}
