package singletone;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SingletonFileReaderWriter singleton = SingletonFileReaderWriter.getInstance();

        String data = "Hello, this is some data to write to a file";
        String filePath = "test.txt";

        try {
            singleton.writeFile(filePath, data);
            System.out.println(singleton.readFile(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}