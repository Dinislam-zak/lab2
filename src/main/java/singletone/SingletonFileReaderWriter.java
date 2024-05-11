package singletone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SingletonFileReaderWriter {
    private static SingletonFileReaderWriter instance;

    private SingletonFileReaderWriter() {
    }

    public static SingletonFileReaderWriter getInstance() {
        if (instance == null) {
            instance = new SingletonFileReaderWriter();
        }
        return instance;
    }

    public String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine());
        }
        scanner.close();
        return content.toString();
    }

    public void writeFile(String filePath, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(data);
        fileWriter.close();
    }
}

