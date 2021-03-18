package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    private UserInterface UI;
    private boolean running;
    private TaskService taskService;
    private Repository repository;
    //field

    public App () throws ParseException {
        UI = new UserInterface();
        running = true;
        taskService = new TaskService();
        repository = new Repository();
        run();
        //constructor
    }

    public void run() throws ParseException {
        UI.printWelcome();
        load();
        while (running) {
            UI.printMenu();
            String getInput = UI.getInput();
            switch(getInput) {
                case "1":
                    System.out.println("Choose Option 1");
                    //add code to create a new task
                    create();
                    break;
                case "2":
                    System.out.println("Choose Option 2");
                    //add code to edit
                    edit();
                    break;
                case "3":
                    System.out.println("Choose Option 3");
                    //add code to marked as done
                    markedAsDone();
                    break;
                case "4":
                    save();
                    running = false;
                    break;
                case "5":
                    System.out.println("Choose Option 5");
                    //add code to show task
                    show();
                    break;
                default:
                    UI.printErrorInput();
            }
        }
    }

    private void load() {
        taskService = repository.read();
    }

    private void save() {
        repository.save(taskService);

    }

    private void markedAsDone() {

        Task temptask = getTask();
        temptask.markedAsDone();
        UI.printMarkedAsDone();


    }

    private void show() {
        ArrayList<Task> tempTasklists = taskService.getTasklist();
        UI.printTasks(tempTasklists);
    }

    private void create() throws ParseException {
        UI.printGetTitle();
        String tempTitle = UI.getInput();

        UI.printGetContent();
        String tempContent = UI.getInput();

        UI.printGetDueDate();
        String tempDueDate = UI.getInput();
        Date DueDate = new SimpleDateFormat("dd/MM/yyyy").parse(tempDueDate);

        UI.printGetProject();
        String tempProject = UI.getInput();

        Task task = new Task(tempTitle, tempContent, DueDate, tempProject);
        //new key word:creating object for Task
        //System.out.println(tempTitle + " " + tempContent + " " + tempDueDate + " " + tempProject);
        taskService.add(task);
    }

    private void edit() throws ParseException {
        UI.printEditMenu();
        String getInput = UI.getInput();
        switch(getInput) {
            case "1":
                System.out.println("Choose Option 1");
                //add code to edit title
                editTitle();
                break;
            case "2":
                System.out.println("Choose Option 2");
                //add code to edit content
                editContent();
                break;
            case "3":
                System.out.println("Choose Option 3");
                //add code to edit date
                editDate();
                break;
            case "4":

                //add code to delete
                editDelete();
                break;
            default:
                UI.printErrorInput();
        }
    }

    private void editDelete() {
        Task temptask = getTask();
        taskService.delete(temptask.getID());
        UI.printTaskDeleted();

    }

    private void editTitle() {
        Task temptask = getTask();
        UI.printGetTitle();
        String tempTitle = UI.getInput();
        temptask.setTitle(tempTitle);
        UI.printTitleEdited();

    }
    private void editContent() {
        Task temptask = getTask();
        UI.printGetContent();
        String tempContent = UI.getInput();
        temptask.setContent(tempContent);
        UI.printContentEdited();
    }

    private void editDate() throws ParseException {
        Task temptask = getTask();
        UI.printGetDueDate();
        String tempDueDate = UI.getInput();
        Date DueDate = new SimpleDateFormat("dd/MM/yyyy").parse(tempDueDate);
        temptask.setDueDate(DueDate);
        UI.printDueDateEdited();

    }

    public Task getTask() {

        show();
        UI.printGetID();
        String tempID = UI.getInput();
        int ID = Integer.parseInt(tempID);
        Task temptask = taskService.search(ID);
        return temptask;
    }
}
