package annotations.exercise5;

import java.lang.reflect.Method;

public class RepeatableAnnotationExample {
    public static void main(String[] args) {
        try {
            // Get the SoftwareModule class
            Class<SoftwareModule> obj = SoftwareModule.class;

            // Get the method with annotations
            Method method = obj.getMethod("processData");

            // Retrieve and print all BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for (BugReport bug : bugReports.value()) {
                    System.out.println("Bug Description: " + bug.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}