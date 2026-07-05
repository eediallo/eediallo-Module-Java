package training.prep.exercise2_2;

public class Main {
    public void main(String[] args) {
        ApplicationLogger applicationLogger = new ApplicationLogger();
        applicationLogger.logInfo("Application started successfully");
        applicationLogger.logError("Application failed to start due to DB connection issue");
    }
}
