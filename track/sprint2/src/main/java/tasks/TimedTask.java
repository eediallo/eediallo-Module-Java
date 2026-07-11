package tasks;

public class TimedTask extends Task {
    private String deadline;

    public TimedTask(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }


    @Override
    public String getStatus() {
        return super.getStatus() + "(due by: " + deadline + ")";
    }

}
