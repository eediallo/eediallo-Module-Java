package management;

import tasks.Task;

import java.util.Arrays;

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

    public Task[] getTasksByStatus(boolean completed) {
        int matchCount = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                matchCount++;
            }
        }

        Task[] filteredTasks = new Task[matchCount];

        int index = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                filteredTasks[index] = tasks[i];
                index++;
            }
        }
        return filteredTasks;
    }

}
