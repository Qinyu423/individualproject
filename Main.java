package com.company;

import javax.swing.text.html.parser.Parser;

public class StartTask {
    public static void main(String[] args) {
        
    }

}

public class Main {

    public static void main(String[] args) {
// this class is the main class of a Todolist App.
        class Task
        {
            private Parser parser;
            private Task currentTask;

            public <Date> Task()
            {
                createTask();
                parser = new Parser();

          String title;
                Date duedate;


                    //print out the opening message for the user.

                    {
                        System.out.println("Welcome to the your TodoList!");
                        System.out.println("Type HELP if you need help");
                    }
                    //import Scanner; this parser reads users input.
                    // Every time it is called it reads a ine from the terminal.

                    class Parser<CommandWords, Scanner> {
                        private final Scanner reader;

                        //create a parser to read from the terminal window

                        public Parser() {
                            CommandWords commands = new CommandsWords();
                            reader = new Scanner(System.in);
                        }

                    }
                }

            private void createTask() {
            }

            public Parser getParser() {
                return parser;
            }

            public void setParser(Parser parser) {
                this.parser = parser;
            }

            public Task getCurrentTask() {
                return currentTask;
            }

            public void setCurrentTask(Task currentTask) {
                this.currentTask = currentTask;
            }
        }
            private void createTask() {
            }

        }
























































































































}











}