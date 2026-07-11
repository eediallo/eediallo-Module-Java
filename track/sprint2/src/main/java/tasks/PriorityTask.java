package tasks;

public class PriorityTask extends Task {
    private String priority;

    public PriorityTask(String description, String priority) {
        super(description);
        this.priority = priority;
    }


    @Override
    public String getStatus() {
        return super.getStatus() + "[Priority: " + priority + "]";
    }

}