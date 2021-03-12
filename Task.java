package com.company;

import java.util.Date;

public class Task {
    private String Title;
    private int ID;
    private String Content;
    private Date DueDate;
    private static int IDgenerator = 0;

    private boolean done;




    public Task(String title, String content, Date dueDate) {
        Title = title;
        Content = content;
        DueDate = dueDate;
        ID = IDgenerator;
        IDgenerator ++;
        done = false;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }
    public boolean markedAsDone () {
        return done = true;
    }

    public boolean isDone() {
        return done;
    }

}

