package individualproject.logic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void testAdd() {
        TaskService taskService = new TaskService();
        Task temp = new Task();
        assertTrue(taskService.add(temp));
    }

    @Test
    void testDelete() {
        TaskService taskService = new TaskService();
    }

    @Test
    void testSearch() {
        TaskService taskService = new TaskService();
        Task temp = new Task();
        taskService.add(temp);
        Task foundTask = taskService.search(0);
        assertTrue(foundTask != null);

    }
    @Test
    void testSearchInEmpty() {
        TaskService taskService = new TaskService();
        Task foundTask = taskService.search(0);
        assertTrue(foundTask == null);

    }
    @Test
    void testGetTasklist() {
        TaskService taskService = new TaskService();
        ArrayList<Task> temp = taskService.getTasklist();
        assertEquals(0,temp.size());
        assertTrue(temp.isEmpty());
    }

    @Test
    void testSetTasklist() {
        TaskService taskService = new TaskService();
    }
}