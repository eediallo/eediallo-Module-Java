package main;

import management.TaskManager;
import tasks.*;

public class Main {

    private void completeGivenTasks(String logMsg, TaskManager taskManager, int from, int to) {
        System.out.println(logMsg);
        for (int i = from; i <= to; i++) {
            taskManager.completeTask(i);
        }
    }

    private void printTaskStatuses(Task[] tasks) {
        for (Task t : tasks) {
            System.out.println(t.getStatus());
        }
    }

    private void logTaskReport(String logMsg, TaskManager taskManager, boolean isCompleted) {
        System.out.println(logMsg);
        Task[] tasks = taskManager.getTasksByStatus(isCompleted);
        printTaskStatuses(tasks);
    }

    private void generalTasksDemo() {
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

        System.out.println("*****************GENERAL TASKS*****************");
        completeGivenTasks("----Completing General task 1 to 5------", taskManager, 1, 5);
        logTaskReport("====Completed General tasks========", taskManager, true);
        logTaskReport("===Incompleted General tasks=======", taskManager, false);
    }

    private void timedTasksDemo() {
        TaskManager taskManager = new TaskManager(10);
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

        System.out.println("*****************TIMED TASKS*****************");
        completeGivenTasks("----Completing timed task 11 to 15------", taskManager, 11, 15);
        logTaskReport("====Completed timed tasks========", taskManager, true);
        logTaskReport("====Incompleted timed tasks========", taskManager, false);

    }

    private void priorityTasksDeno() {
        TaskManager taskManager = new TaskManager(5);
        taskManager.addTask(new PriorityTask("Watch football game", "LOW"));
        taskManager.addTask(new PriorityTask("Go shopping", "MEDIUM"));
        taskManager.addTask(new PriorityTask("Make dinner", "HIGH"));
        taskManager.addTask(new PriorityTask("Complete assignment", "HIGH"));
        taskManager.addTask(new PriorityTask("Make breakfast", "LOW"));

        System.out.println("*****************Priority TASKS*****************");
        completeGivenTasks("Completing priority tasks 21 to 23....", taskManager, 21, 23);
        logTaskReport("===========Completed priority tasks=======", taskManager, true);
        logTaskReport("===========Incompleted priority tasks=======", taskManager, false);
    }

    public static void main(String[] args) {
        new Main().generalTasksDemo();
        new Main().timedTasksDemo();
        new Main().priorityTasksDeno();
    }
}
