package training.exercise3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {

    public String readFile(String fileName) throws FileNotFoundException, IOException {

        if (fileName == null) {
            throw new IllegalArgumentException("File name must not be null");
        }

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            FileReader reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }

            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw e;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close buffer: " + e.getMessage());
                }
            }
        }

    }
}
