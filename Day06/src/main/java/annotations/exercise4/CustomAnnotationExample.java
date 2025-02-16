package annotations.exercise4;

import java.lang.reflect.Method;

public class CustomAnnotationExample {
    public static void main(String[] args) {
        try {
            // Get the TaskManager class
            Class<TaskManager> obj = TaskManager.class;

            // Get the method with annotation
            Method method = obj.getMethod("completeTask");

            // Check if the annotation is present
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the annotation
                TaskInfo annotation = method.getAnnotation(TaskInfo.class);

                // Display annotation details
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Assigned To: " + annotation.assignedTo());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}