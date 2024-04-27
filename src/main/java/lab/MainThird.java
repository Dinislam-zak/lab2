package lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainThird {
    public static void main(String[] args) {
        createFile("The Only Thing They Fear Is You");
    }
    public static void createFile(String text) {
        try {
            Files.createFile(Paths.get("file4.txt"));
        } catch (IOException e) {}

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("file4.txt"))) {
            int length = text.length();
            dos.writeInt(length);
            dos.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

