package main;

import management.TaskManager;
import tasks.PriorityTask;
import tasks.Task;
import tasks.TimedTask;

public class Main {

    public static void generalTasksDemo() {
        System.out.println("*****************GENERAL TASK*****************");
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

        System.out.println("----Completing General task 1 to 5------");
        for (int i = 1; i <= 5; i++) {
            taskManager.completeTask(i);
        }

        System.out.println("====Completed General tasks========");
        Task[] completeTasks = taskManager.getTasksByStatus(true);
        for (Task t : completeTasks) {
            System.out.println(t.getStatus());
        }

        System.out.println("===Incompleted General tasks=======");
        Task[] incompleteTasks = taskManager.getTasksByStatus(false);
        for (Task t : incompleteTasks) {
            System.out.println(t.getStatus());
        }
    }

    public static void timedTasksDemo() {
        TaskManager taskManager = new TaskManager(10);
        System.out.println("*****************TIMED TASK*****************");
        taskManager.addTask(new TimedTask("Call school", "06/07/2026"));
        taskManager.addTask(new TimedTask("Do laundering", "06/07/2026"));
        taskManager.addTask(new TimedTask("Update notebook", "06/07/2026"));
        taskManager.addTask(new TimedTask("Make a plan", "06/07/2026"));
        taskManager.addTask(new TimedTask("Send money", "06/07/2026"));
        taskManager.addTask(new TimedTask("Call Micheal", "06/07/2026"));
        taskManager.addTask(new TimedTask("Attend catch meeting", "06/07/2026"));
        taskManager.addTask(new TimedTask("Fix registration bug", "06/07/2026"));
        taskManager.addTask(new TimedTask("Confirm project completion", "06/07/2026"));
        taskManager.addTask(new TimedTask("Hang out with friends", "06/07/2026"));

        System.out.println("----Completing timed task 11 to 15------");
        for (int i = 11; i <= 15; i++) {
            taskManager.completeTask(i);
        }

        System.out.println("====Completed timed tasks========");
        Task[] timedCompleteTasks = taskManager.getTasksByStatus(true);
        for (Task t : timedCompleteTasks) {
            System.out.println(t.getStatus());
        }

        System.out.println("===Incompleted timed tasks=======");
        Task[] timedIncompleteTasks = taskManager.getTasksByStatus(false);
        for (Task t : timedIncompleteTasks) {
            System.out.println(t.getStatus());
        }


    }

    public static void priorityTasksDeno() {
        TaskManager priorityTask = new TaskManager(5);
        priorityTask.addTask(new PriorityTask("Watch football game", "LOW"));
        priorityTask.addTask(new PriorityTask("Go shopping", "MEDIUM"));
        priorityTask.addTask(new PriorityTask("Make dinner", "HIGH"));
        priorityTask.addTask(new PriorityTask("Complete assignment", "HIGH"));
        priorityTask.addTask(new PriorityTask("Make breakfast", "LOW"));

        System.out.println("Completing priority tasks 21 to 23....");
        for (int i = 21; i <= 23; i++) {
            priorityTask.completeTask(i);
        }

        System.out.println("===========Completed priority tasks=======");
        Task[] completedPriorityTasks = priorityTask.getTasksByStatus(true);
        for (Task pTask : completedPriorityTasks) {
            System.out.println(pTask.getStatus());
        }

        System.out.println("===========Incompleted priority tasks=======");
        Task[] incompletedPriorityTasks = priorityTask.getTasksByStatus(false);
        for (Task pTask : incompletedPriorityTasks) {
            System.out.println(pTask.getStatus());
        }
    }


    public static void main(String[] args) {
        Main.generalTasksDemo();
        Main.timedTasksDemo();
        Main.priorityTasksDeno();
    }
}
