package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Repository {
     public void createFile () {
         try {
             File myObj = new File("Database.txt");
             if (myObj.createNewFile()) {
                 System.out.println("File created: " + myObj.getName());
             } else {
                 System.out.println("File already exists.");
             }
         } catch (IOException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
     }
     public void writeToFile (TaskService taskService) {
         try {
             FileWriter myWriter = null;

             myWriter = new FileWriter("Database.txt");
             ArrayList<Task> TaskLists = taskService.getTasklist();
             for (Task T:TaskLists) {
                 myWriter.write(T.getID()+","+T.getTitle()+","+
                         T.getDueDate()+","+T.getProject()+","+
                         T.getContent()+","+(T.isDone() ? "completed" : "incomplete")+"\n");
                 // \n adding a new line
             }
             myWriter.close();
             System.out.println("Successfully wrote to the file.");
         } catch (IOException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
     }
     public void save (TaskService taskService) {
         createFile();
         writeToFile(taskService);
     }

     public TaskService read () {
         TaskService taskService = new TaskService();

         try {
             File myObj = new File("Database.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 String[] taskInformation = data.split(",");
                 Date dueDate = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy").parse(taskInformation[2]);
                 Task tempTask = new Task(taskInformation[1],taskInformation[3],
                         dueDate,taskInformation[4]);
                 int ID =Integer.parseInt(taskInformation[0]);
                 tempTask.setID(ID);
                 tempTask.setDone(taskInformation[5].equals("complete"));
                 //if taskInformation[5] equals to complete,then it's true.
                 taskService.add(tempTask);

             }
             myReader.close();
         } catch (FileNotFoundException | ParseException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
         return taskService;

     }
}
