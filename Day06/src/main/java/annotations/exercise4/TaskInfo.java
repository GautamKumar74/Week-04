package annotations.exercise4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime for reflection
@interface TaskInfo {
    String priority();
    String assignedTo();
}
