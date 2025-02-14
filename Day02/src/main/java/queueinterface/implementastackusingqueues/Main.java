package queueinterface.implementastackusingqueues;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack= new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top Element: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top Element: " + stack.top());
    }
}
