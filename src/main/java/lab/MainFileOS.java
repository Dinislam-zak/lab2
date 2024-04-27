package lab;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MainFileOS {
    public static void main(String[] args) {

        String[] lst = {"Люблю","грозу","в","начале","мая"};


        try (OutputStream os = new FileOutputStream("test_fos.txt")) {
            for (String s : lst) {
                os.write((s + " ").getBytes(StandardCharsets.UTF_8));
            }

            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
