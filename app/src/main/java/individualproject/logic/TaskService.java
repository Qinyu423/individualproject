package individualproject.logic;

import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> Tasklist;

    public TaskService() {
        Tasklist = new ArrayList<>();

    }
    public boolean add(Task newTask) {
        return Tasklist.add(newTask);

    }
    public void delete(int searchID) {
        Task task = search(searchID);
        Tasklist.remove(task);

    }
    public Task search(int searchID) {
        Task task = null;
        for (int i = 0; i < Tasklist.size(); i++) {
           task = Tasklist.get(i);
           if (searchID == task.getID()) {
               return task;
           }

        }
        return null;
    }

    public ArrayList<Task> getTasklist() {
        return Tasklist;
    }

    public void setTasklist(ArrayList<Task> tasklist) {
        Tasklist = tasklist;
    }
}
 // do edit title, edit content,
 // create user interface
 //
