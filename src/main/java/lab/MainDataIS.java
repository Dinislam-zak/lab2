package lab;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainDataIS {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("test_int_data.bin"))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
