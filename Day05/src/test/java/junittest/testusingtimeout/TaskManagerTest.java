package junittest.testusingtimeout;

import junit.testingusingtimeout.TaskManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class TaskManagerTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fails if execution takes longer than 2 seconds
    void testLongRunningTask() {
        String result = TaskManager.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
