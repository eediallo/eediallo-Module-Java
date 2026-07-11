package tasks;

/**
 * Class Task
 * <p>
 * Fields:
 * private final int id (unique)
 * private String description
 * private boolean completed
 * Methods:
 * public void complete() → mark as completed, prevent double-completion
 * public String getStatus() → returns a human-readable status
 * Consider using static for generating unique IDs
 * Specialised Tasks
 * <p>
 * Create at least two subclasses (e.g., TimedTask, PriorityTask)
 * Add additional fields (e.g., deadline, priority)
 * Override methods to demonstrate polymorphic behaviour
 */
public class Task {
    private static int idSequence = 1;

    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = idSequence++;
        this.description = description;
        this.completed = false; // tasks starts incomplete
    }

    public void complete() {
        if (completed) {
            throw new IllegalStateException("Task already completed");
        }

        System.out.println("Completing task " + id + "...");
        completed = true;
    }

    public String getStatus() {
        return completed ? ("[X] Task " + id + ": " + description) : ("[ ] Task  " + id + ": " + description);
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
}

