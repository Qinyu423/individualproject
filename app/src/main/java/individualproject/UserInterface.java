package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner b = new Scanner(System.in);

    public String getInput() {
       return b.nextLine();
    }
    public void printWelcome() {
        System.out.println("Welcome to your TodoList!");
    }
    public void printMenu() {
        System.out.println("1) Create a new Task");
        System.out.println("2) Edit");
        System.out.println("3) Marked as done");
        System.out.println("4) Exit and Save");
        System.out.println("5) Show task");
    }
    public void printEditMenu () {
        System.out.println("1) Edit Title");
        System.out.println("2) Edit Content");
        System.out.println("3) Edit Date");
        System.out.println("4) Delete");
    }
    public void printShowMenu () {
        System.out.println("1) Show by Date");
        System.out.println("1) Show by Project");
    }
    public void printTasks (ArrayList<Task> ListofTasks) {
        for (int i = 0; i< ListofTasks.size(); i++) {
            Task tempTask = ListofTasks.get(i);
            System.out.println(tempTask.getID()+ "." + tempTask.getTitle() + "  " +
                    tempTask.getDueDate() + tempTask.getProject() +
                    (tempTask.isDone() ? "completed" : "incomplete"));
            //? means if condition, true to complete, else to incomplete
            System.out.println(tempTask.getContent());

        }
    }

    public void printErrorInput() {
        System.out.println("Wrong Input, Try Again!");
    }
    public void printGetTitle () {
        System.out.println("Please enter title");
    }
    public void printGetContent () {
        System.out.println("Please enter Content");
    }
    public void printGetDueDate () {
        System.out.println("Please enter DueDate as dd/MM/yyyy");
    }
    public void printGetProject ()  {
        System.out.println("Please enter Project");
    }

    public void printGetID() {
        System.out.println("Please choose the task ID");
    }
    public void printMarkedAsDone() {
        System.out.println("Bravo! you completed this task!");
    }
    public void printTitleEdited() {
        System.out.println("Title changed!");
    }
    public void printContentEdited() {
        System.out.println("Content changed!");
    }
    public void printDueDateEdited() {
        System.out.println("DueDate changed!");
    }
    public void printTaskDeleted() {
        System.out.println("Task deleted!");
    }
}

