package main;

import management.TaskManager;
import tasks.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(10);
        taskManager.addTask(new Task("Going to the Gym"));
        taskManager.addTask(new Task("Do homework"));
        taskManager.addTask(new Task("Work the dog"));
        taskManager.addTask(new Task("Submit work"));
        taskManager.addTask(new Task("Complete code review"));
        taskManager.addTask(new Task("Calculate eligibility"));
        taskManager.addTask(new Task("Request pair programming session"));
        taskManager.addTask(new Task("Attend intro meeting"));
        taskManager.addTask(new Task("Volunteer at CYF"));
        taskManager.addTask(new Task("Wash the dishes"));

        System.out.println("----Completing task 1 to 5------");
        for (int i = 1; i <= 5; i++) {
            taskManager.completeTask(i);
        }

        System.out.println("====Completed tasks========");
        Task[] completeTasks = taskManager.getTasksByStatus(true);
        for (Task t : completeTasks) {
            System.out.println(t.getStatus());
        }

        System.out.println("===Incompleted tasks=======");
        Task[] incompleteTasks = taskManager.getTasksByStatus(false);
        for (Task t : incompleteTasks) {
            System.out.println(t.getStatus());
        }
    }
}
