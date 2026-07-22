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

    /**
     * Adds a task to the task manager if capacity permits.
     * <p>
     * If the task array is full, no task will be added and a warning message
     * will be printed to the console.
     *
     * @param task the {@link Task} object to add to the manager.
     */
    public void addTask(Task task) {
        // prevent out of bound crash
        if (taskCount >= tasks.length) {
            System.out.println("Task manager is full! No more task can be added.");
            return;
        }
        tasks[taskCount] = task;
        taskCount++;
    }

    /**
     * Completes a specific task by its unique identifier.
     * <p>
     * Searches through the active tasks and marks the matching task as completed.
     * Prints a warning message if the provided task ID is not found.
     *
     * @param id the unique identifier of the task to complete
     */
    public void completeTask(int id) {

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].complete();
                return;
            }
        }

        System.out.println("Task with ID " + id + " not found");
    }

    /**
     * Gets tasks based on their completion status.
     * <p>
     * Searches through the active tasks to find matches and
     * collects them into a filtered list.
     *
     * @param completed {@code true}  to retrieve completed tasks; {@code false} for incompleted tasks
     * @return list of task matching the specified completion status
     */
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
