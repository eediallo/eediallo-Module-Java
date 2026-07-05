package training.prep.exercise2_2;

public class ApplicationLogger {
    private final FileLogger fileLogger = new FileLogger();

    public void logInfo(String message) {
        fileLogger.openFile();
        fileLogger.writeLine("[INFO]: " + message);
        fileLogger.closeFile();
    }

    public void logError(String message) {
        fileLogger.openFile();
        fileLogger.writeLine("[ERROR]: " + message);
        fileLogger.closeFile();
    }


}
