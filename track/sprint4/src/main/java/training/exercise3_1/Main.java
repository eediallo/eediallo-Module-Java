package training.exercise3_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();

        String validFile = "valid.txt";
        String emptyFile = "empty.txt";
        String nonExistingFile = "non_existing.txt";

        createDummyFiles(validFile, emptyFile);

        System.out.println("READING VALID FILE...");
        testFileReadingDemo(fileReaderService, validFile);

        System.out.println("\nREADING EMPTY FILE...");
        testFileReadingDemo(fileReaderService, emptyFile);

        System.out.println("\nREADING NON EXISTING FILE...");
        testFileReadingDemo(fileReaderService, nonExistingFile);

        System.out.println("\nPASSING NULL FILE NAME...");
        testFileReadingDemo(fileReaderService, emptyFile);

        // remove dummy file
        new File(validFile).delete();
        new File(emptyFile).delete();
    }


    private static void testFileReadingDemo(FileReaderService fileReaderService, String validFile) {
        try {
            String content = fileReaderService.readFile(validFile);
            System.out.println("SUCCESS: File Content:\n" + content);
        } catch (IOException e) {
            System.out.println("CAUGHT INVALID IO EXCEPTION: " + e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println("CAUGHT NULL ARGUMENT EXCEPTION: " + e.getMessage());
        }

    }

    private static void createDummyFiles(String validFile, String emptyFile) {
        try (FileWriter fileWriter = new FileWriter(validFile)) {
            fileWriter.write("Hello, World!\nThis file is for testing purpose only");
        } catch (IOException e) {
            System.err.println("Failed to create valid test file.");
        }
        try {
            // create empty file
            File empty = new File(emptyFile);
            empty.createNewFile();
        } catch (IOException e) {
            System.err.println("Could not create dummy files for test: " + e.getMessage());
        }
    }
}
