package P001_TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> taskManager = new ArrayList<>();

    String taskName;

    public String getTaskName(String taskName) {
        return taskName = taskName;
    }

    public void setTaskManager(ArrayList<String> taskManager) {
        this.taskManager = taskManager;
    }

    public void addTask () {
        System.out.print("Enter task: ");
        String task = sc.nextLine();

        if(taskManager.contains(this.taskName)) {
            System.out.println("Task is already added");
        } else {
            this.taskManager.add(task);
        }

        System.out.println("Task added!");
    }

    public void viewTasks () {
        System.out.println("=== ALL TASKS ===");
        for (int i = 0; i < taskManager.size(); i ++) {
            System.out.println((i + 1) + ". " + taskManager.get(i));
        }
    }

    public void finishedTask() {

        viewTasks();

        System.out.println("Enter task number to complete: ");
        int taskNum = sc.nextInt();

        for (int i = 0; i < taskManager.size(); i++) {
            if (taskNum > 0 && taskNum < taskManager.size()) {
                String complete = taskManager.remove(taskNum);
                System.out.println(complete + ' ' + "has been Completed!");
                return;
            } else {
                    System.out.println("Invalid task number!");
            }
        }

        viewTasks();
    }



    void mainMenu() {
        while (true) {
            System.out.println("\n=== TASK MANAGER ===");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Search Task");
            System.out.println("5. Show Total");
            System.out.println("6. Exit");

            System.out.print("Select: ");
            String choice = sc.nextLine();
            if (choice.equals("1"))  addTask();
            else if (choice.equals("2")) viewTasks();
            else if (choice.equals("3")) finishedTask();
            else if (choice.equals("4")) System.out.println("Search Task");
            else if (choice.equals("5")) System.out.println("Show Total");
            else System.out.println("Exit");
        }
    }

    void startApp() {
        while (true) {
            mainMenu();
        }
    }


}
