package com.collections.junit.listmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        manager.addElement(list, 20);
        assertEquals(Arrays.asList(10, 20), list, "Elements should be added correctly");
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        manager.removeElement(list, 20);
        assertEquals(Arrays.asList(10, 30), list, "Element 20 should be removed");

        // Removing non-existing element should not change list
        manager.removeElement(list, 50);
        assertEquals(Arrays.asList(10, 30), list, "List should remain unchanged if element not found");
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(3, manager.getSize(list), "Size should be 3");

        list.clear();
        assertEquals(0, manager.getSize(list), "Size should be 0 after clearing list");
    }
}