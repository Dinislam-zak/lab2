package lab;

import java.io.*;
import java.util.HashMap;

public class MainSecond {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String inputFile = args[0];
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                char ch = (char) data;
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream outputStream = new FileOutputStream("output.txt")) {
            for (char ch : charCount.keySet()) {
                outputStream.write((ch + " - " + charCount.get(ch) + "\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
