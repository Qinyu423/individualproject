package individualproject.logic;

import java.util.Date;

public class Task {
    private String Title;
    private int ID;
    private String Content;
    private Date DueDate;
    private static int IDgenerator = 0;
    private String Project;

    private boolean done;




    public Task(String title, String content, Date dueDate, String project) {
        Title = title;
        Content = content;
        DueDate = dueDate;
        Project = project;
        ID = IDgenerator;
        IDgenerator ++;
        done = false;
    }

    public Task() {

    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return Title;
    }

    /**
     *
     * @param title
     */
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

    public void setDone (boolean done) {
        this.done = done;
        //this.done refers to private boolean done;

    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }
}

