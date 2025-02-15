package junittest.testlistoperations;

import junit.testinglistoperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        assertTrue(ListManager.removeElement(list, 10));
        assertFalse(list.contains(10));
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 15);
        assertEquals(2, ListManager.getSize(list));
        ListManager.removeElement(list, 5);
        assertEquals(1, ListManager.getSize(list));
    }

    @Test
    void testRemoveNonExistentElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        assertFalse(ListManager.removeElement(list, 99)); // 99 is not in the list
        assertEquals(1, list.size());
    }

    @Test
    void testNullList() {
        assertEquals(0, ListManager.getSize(null));
        assertFalse(ListManager.removeElement(null, 10));
    }
}
