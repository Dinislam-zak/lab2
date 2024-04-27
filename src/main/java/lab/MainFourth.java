package lab;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFourth {
    public static void main(String[] args) {

        readFile(new File("file5.txt"));
    }
    public static String readFile(File file) {

        StringBuilder text = new StringBuilder();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int length = dis.readInt();
            System.out.println(length);

            int i = 0;
            while ((i = dis.read()) != -1) {
                text.append((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        return text.toString();
    }
}
