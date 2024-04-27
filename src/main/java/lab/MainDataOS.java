package lab;

import java.io.*;

public class MainDataOS {
    public static void main(String[] args) throws FileNotFoundException {
        try (OutputStream os = new FileOutputStream("test_innt_data.bin");){
            DataOutputStream dos = new DataOutputStream(os);{

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
