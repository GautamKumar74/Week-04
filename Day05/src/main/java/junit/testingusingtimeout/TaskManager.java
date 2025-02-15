package junit.testingusingtimeout;

public class TaskManager {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long-running task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
