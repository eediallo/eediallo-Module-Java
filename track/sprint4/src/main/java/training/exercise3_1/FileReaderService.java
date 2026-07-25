package training.exercise3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {

    public String readFile(String fileName) throws IOException, InvalidFileFormatException {

        if (fileName == null) {
            throw new IllegalArgumentException("File name must not be null");
        }

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
        }

        if(stringBuilder.length() == 0){
            throw  new InvalidFileFormatException("File can not be empty");
        }

        return stringBuilder.toString().trim();

    }

}
