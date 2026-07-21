package management;

import tasks.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TaskManager
 * <p>
 * Fields:
 * private Task[] tasks
 * private int taskCount
 * Methods:
 * public void addTask(Task task)
 * public void completeTask(int id)
 * public Task[] getTasksByStatus(boolean completed)
 */
public class TaskManager {
    private Task[] tasks;
    private int taskCount;

    public TaskManager(int capacity) {
        this.tasks = new Task[capacity];
        this.taskCount = 0;
    }

    public void addTask(Task task) {
        // prevent out of bound crash
        if (taskCount >= tasks.length) {
            System.out.println("Task manager is full! No more task can be added.");
            return;
        }
        tasks[taskCount] = task;
        taskCount++;
    }

    public void completeTask(int id) {

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].complete();
                return;
            }
        }

        System.out.println("Task with ID " + id + " not found");
    }

    public List<Task> getTasksByStatus(boolean completed) {
        List<Task> filteredTasks = new ArrayList<>();

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                filteredTasks.add(tasks[i]);
            }
        }

        return filteredTasks;
    }

    public void completeGivenTasks(String logMsg, TaskManager taskManager, int from, int to) {
        System.out.println(logMsg);
        for (int i = from; i <= to; i++) {
            taskManager.completeTask(i);
        }
    }

    public void printTaskStatuses(List<Task> tasks) {
        for (Task t : tasks) {
            System.out.println(t.getStatus());
        }
    }

    public void logTaskReport(String logMsg, TaskManager taskManager, boolean isCompleted) {
        System.out.println(logMsg);
        List<Task> tasks = taskManager.getTasksByStatus(isCompleted);
        printTaskStatuses(tasks);
    }

}
